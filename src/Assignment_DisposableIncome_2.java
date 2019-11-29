/* SELF ASSESSMENT
   1. Did I use easy-to-understand meaningful variable and CONSTANT names?
       Mark out of 10: 10
       Comment: I only hardcoded one value which was 100 and I believe that to be ok.
   2. Did I format the variable and CONSTANT names properly (in lowerCamelCase and UPPERCASE_WITH_UNDERSCORES)?
       Mark out of 10: 10
       Comment: I used UPPERCASE_WITH_UNDERSCORES for all final constants and lowerCamelCase for all variables
   3. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: Every line is indented correctly and ony one line ran off screen requiring splitting it in half and further indentation below it.
   4. Did I read the input correctly from the user using appropriate questions?
       Mark out of 15: 13
       Comment: I followed the specified questions exactly and clearly however I do think they could've been more specific,
                for example one's commute cost can change each week not just month.
   5. Did I compute the disposable income and disposable income percentage correctly, and output it in the correct format?
       Mark out of 15: 14
       Comment: I computed everything correctly and outputted the disposable income as a double. However I chose to output the income percentage as a rounded off double with no decimal points.
                This could've been made to round to more decimal points and therefore more accurate.
  6. Did I use an appropriate series of if statements to generate the income analysis to the user?
       Mark out of 25:  23
       Comment: I minimised the amount of if statements that I used by including && in some statements.
                I also used an else statement to cover the final output as all other possibilities were covered already.
                I docked marks as it would have been much shorter to use ? and : to do the same things that I did
   7. Did I provide the correct output for each possibility in an easy to read format?
       Mark out of 10: 10
       Comment: Each possibility produces a clear and concise output to tell the user how close they are to the average disposable income
   8. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I could've explained myself slightly better in comments but it is understandable.
   Total Mark out of 100 (Add all the previous marks): 95
*/

import java.util.Scanner;

public class Assignment_DisposableIncome_2 {

    public static final double INCOME_TAX_PERCENTAGE = 0.35;
    public static final double AVERAGE = 500;
    public static final double OVER_AVERAGE = (1.5 * AVERAGE);
    public static final double UNDER_AVERAGE = (0.5 * AVERAGE);
    public static final double NO_INCOME = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much are you paid a month before tax? ");
        double grossIncome = scanner.nextDouble();
        double netIncome = grossIncome - (grossIncome * INCOME_TAX_PERCENTAGE);
        System.out.println("How much do you pay in rent/mortgage a month? ");
        double rent = scanner.nextDouble();
        System.out.println("How much does your commute cost a month? ");
        double commuteCost = scanner.nextDouble();
        System.out.println("How much do you spend on food per month? ");
        double foodCost = scanner.nextDouble();
        double disposableIncome = netIncome - rent - commuteCost - foodCost;
        double percentageOfSalary = (disposableIncome / grossIncome) * 100;
        System.out.println("Your monthly disposable income is €" + disposableIncome + " which is approximately " + Math.round(percentageOfSalary)
                + "% of your salary.");

        if(disposableIncome > OVER_AVERAGE) {
            System.out.println("You have much more than the average disposable income per month!");
        }
        else if(disposableIncome > AVERAGE && disposableIncome <= OVER_AVERAGE) {
            System.out.println("You have more than the average disposable income per month.");
        }
        else if(disposableIncome < AVERAGE && disposableIncome >= UNDER_AVERAGE) {
            System.out.println("You have less than the average disposable income per month.");
        }
        else if(disposableIncome < UNDER_AVERAGE && disposableIncome > NO_INCOME) {
            System.out.println("You have much less than the average disposable income per month.");
        }
        else if(disposableIncome == AVERAGE) {
            System.out.println("You have exactly the average disposable income per month.");
        }
        else {
            System.out.println("You have negative or no disposable income per month.");
        }

    }
}