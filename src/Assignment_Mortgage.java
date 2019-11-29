/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: All constants were formatted in all upper case lettering and variables made use of lowerCamelCase.
                 I chose not to make a constant for numbers like 100(for percentages), 0 for nothing and 1 as part of the formula.
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment: None of the lines move off the screen so yes.
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment: I made use of a variable called exit and looped the main function until exit was true which only occurred if the user said no to using the calculator again.
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 10
        Comment: All inputs and outputs are as shown in the question brief.
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment: I made use of recursion within an if statement to handle if a non boolean was entered and produce an error message.
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 16
        Comment: I implemented the formula as shown in the question however it appeared slightly messy so I attempted to add some constants for a few numbers such as MONTHS_IN_YEAR.
                 However it still looks hard to understand so I feel it could have been implemented in a more readable way hence I docked 4 marks.
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 16
        Comment: I made use of a for loop to decrease and increase the mortgage by the amount paid and apr respectively each month while also increasing a month variable.
                 However I docked 4 marks because I believe my way of copying the mortgageAmount variable into mortgageAmountLoop is somewhat messy as well as my formula for increasing my APR.
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I elaborated on all marks given.
 Total Mark out of 100 (Add all the previous marks): 92
*/

import java.util.Scanner;

public class Assignment_Mortgage {

    public static final int TERM = 20;
    public static final int MONTHS_IN_YEAR = 12;
    public static final int ERROR = -1;

    public static void main(String[] args) {

        boolean exit = false;
        int years = 0;
        int months = 0;

        while(exit == false) {
            System.out.println("Welcome to the mortgage calculator.");
            double mortgageAmount = readDoubleFromUser("Please enter the mortgage amount: ");
            double apr = readDoubleFromUser("Please enter the annual interest rate: ");
            System.out.println("Assuming a " + TERM + " year term, the monthly repayments would be " + calculateMonthlyRepayment(mortgageAmount, TERM, apr));
            double afford = readDoubleFromUser("How much can you afford to pay per month? ");

            if(calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) != ERROR) {
                years = calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) / MONTHS_IN_YEAR;
                months = calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) % MONTHS_IN_YEAR;
                System.out.println("If you pay " + afford + " per month your mortgage would be paid off in " + years + " years and " + months + " months.");
            }
            else {
                System.out.println("You can never pay off your mortgage :(");
            }

            System.out.println("Would you like to use the mortgage calculator again? (yes/no); ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equals("yes")) {
                exit = false;
            }
            else if(input.equals("no")){
                exit = true;
                scanner.close();
            }
        }

    }

    public static double readDoubleFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        double input = 0.00;
        if(scanner.hasNextDouble()) {
            input = scanner.nextDouble();
        }
        else {
            System.out.println("Error! Input was not a double.");
            readDoubleFromUser(prompt);
        }
        return input;
    }

    public static double calculateMonthlyRepayment(double mortgageAmount, double duration, double apr) {
        double monthlyRepayment = (mortgageAmount * (apr/MONTHS_IN_YEAR/100))/(1 - Math.pow(1 + (apr/MONTHS_IN_YEAR/100), -MONTHS_IN_YEAR*duration));
        return monthlyRepayment;
    }

    public static int calculateMonthsToRepayMortgage(double mortgageAmount, double repayMonthly, double apr) {
        int months = 0;
        if(repayMonthly > (mortgageAmount + (mortgageAmount*(apr/MONTHS_IN_YEAR/100))) - mortgageAmount) {
            for(double mortgageAmountLoop = mortgageAmount; mortgageAmountLoop > 0; mortgageAmountLoop -= repayMonthly ) {
                months++;
                mortgageAmountLoop = mortgageAmountLoop + (mortgageAmountLoop*(apr/MONTHS_IN_YEAR/100));
            }
        }
        else {
            return ERROR;
        }
        return months;
    }
}
