/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10
       Comment: I believe I did use appropriate constants as the only one I did hardcode was the constant of 100 to convert to a percentage.
                However I did not feel it was necessary to create a constant for this value.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5
       Comment: My only CONSTANT named INCOME_TAX_PERCENTAGE explains its meaning well I feel.
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5: 5
       Comment: As can be seen, INCOME_TAX_PERCENTAGE, is in all UPPERCASE with underscores as per the coding standard.
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 9
       Comment: Almost all variables were easy-to-understand and meaningful.
       However I deducted one mark as gross and net income might confuse some people if they don't understand the terminology.
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10: 10
       Comment: All variable names are in lowerCamelCase. eg grossIncome
   6. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: Every line is indented correctly and no lines run off screen, requiring further indentation below.
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10: 7
       Comment: Each question made sense however they could have been slightly more specific as ones commute cost can change each month.
   8. Did I compute the disposable income correctly?
       Mark out of 10: 10
       Comment: I followed the correct formula.
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10: 9
       Comment: I did compute it correctly however as a result of using doubles I chose to round it off to afinal long answers.
       This could result in a loss of a minor amount of information about the percentage.
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10: 10
       Comment: The output string is the very same as in the examples. It is also likely that the example rounded up the percentage to get 8% as it should be 7.5%.
   11. How well did I complete this self-assessment?
       Mark out of 10: 10
       Comment: I believe I gave myself a fair mark on each and gave a satisfactory comment aswell.
   Total Mark out of 100 (Add all the previous marks): 95
*/

import java.util.Scanner;

public class Assignment_DisposableIncome {

    public static final double INCOME_TAX_PERCENTAGE = 0.35;
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

    }
}
