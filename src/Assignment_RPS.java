/* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code?
       Mark out of 10: 10
       Comment: I could have used constants within the if statements for deciding who has one each round, however I felt this was unnecessary.
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: All variables and constants are formatted correctly.
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: Yes, I used the Random library and the nextInt() function.
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: I simply read the number the user inputted using the Scanner library nextInt() function.
                Later in the code I compared this number to others in the if statement to determine of the user won or lost.
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: To compare the choices I made some if cases comparing the number the user entered with the computers randomly generated number.
                For example if the number the computer entered was one less than the number that the user entered then the user must win as 3(Scissors) < 2(Paper) < 1(Rock).
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 8
       Comment: When outputting the score I wanted to have it print the string for the guess instead of just the number. Therefore I wrote an
                if case to convert the guess to the corresponding string (paper, rock or scissors) however I believe there is possibly a better
                way to implement this that is less messy and more efficient.
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment: I simply created a loop that ran the code for each game a set number of times as specified by the constant GAMES.
   8. Did I output the final scores correctly after the 5 games were played.
       Mark out of 10: 10
       Comment: I made it output in the exact format as the example output given in the assignment. After each game I made use of post increment to increment the score.
                I chose to make it so a tie does not increment either players score.
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I answered all questions and filled in all comments with relevant information.
   Total Mark out of 100 (Add all the previous marks): 98
*/

import java.util.Random;
import java.util.Scanner;

public class Assignment_RPS {

    public static final int GAMES = 5;
    public static final int NUM_OPTIONS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerScore = 0;
        int userScore = 0;
        for(int i = 0; i < GAMES; i++) {
            System.out.println("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(NUM_OPTIONS) + 1;

            //Convert the choice to a string for use in the prints down below
            String printChoice;
            if (computerChoice == 1) {
                printChoice = "Rock";
            }
            else if (computerChoice == 2) {
                printChoice = "Paper";
            }
            else {
                printChoice = "Scissors";
            }

            if (userChoice > 0 && userChoice < 4) {
                if (userChoice - 1 == computerChoice) {
                    System.out.println("I lose this round as I chose " + printChoice);
                    userScore++;
                }
                else if (computerChoice - 1 == userChoice) {
                    System.out.println("I win this round as I chose " + printChoice);
                    computerScore++;
                }
                else if (userChoice - 2 == computerChoice) {
                    System.out.println("I win this round as I chose " + printChoice);
                    computerScore++;
                }
                else if (computerChoice - 2 == userChoice) {
                    System.out.println("I lose this round as I chose " + printChoice);
                    userScore++;
                }
                else if (userChoice == computerChoice) {
                    System.out.println("This round is a tie as I chose " + printChoice + " too");
                }
            }
            else {
                System.out.println("That is an invalid choice! You have wasted this turn.");
            }


        }
        System.out.println("The final score was Computer: " + computerScore + " User: " + userScore);
        scanner.close();
    }
}
