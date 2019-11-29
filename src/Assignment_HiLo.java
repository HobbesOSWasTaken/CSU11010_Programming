/* SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 5
       Comment: I made sure to only use constants when necessary to make the understanding of the code clearer. For example the cards Jack, Queen, King and Ace.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
       Mark out of 5: 5
       Comment: The Jack, Queen, King and ACE constants are all in upper case
   3. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 10
       Comment: From reading the code I believe the variable names are indeed beneficial to understanding it
   4. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: All variable names are in lowerCamelCase as per the coding standard
   5. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: The code is indented and formatted nicely to make it easy to read
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose?
       Mark out of 20: 19
       Comment: I used a while loop which will continuously run until the user has successfully guessed 4 in a row. The brief on blackboard did not specify an ability to lose the game therefore one is not included
   7. Did I check the input to ensure that invalid input was handled appropriately?
       Mark out of 10: 10
       Comment: I included check for any input that was not a correct guess which would simply allow them to make another guess while giving the message of "INVALID INPUT! Please try again."
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)?
       Mark out of 10: 10
       Comment: I made use of the Random library in java to generate my cards randomly. As the random.nextInt function is 0 inclusive and bound exclusive I made sure to add 2 to the result each time I calculated a random card.
                This would ensure I could not get a card lower than 2. For the bound I wanted to use a constant so I used ACE but took away 1 so that I could not get a card large than 14.
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King?
       Mark out of 10: 10
       Comment: For the strings Jack, Queen, King and ACE I made use of the constants with an if else statement to print them each time.
   10. Did I report whether the user won or lost the game before the program finished?
       Mark out of 10: 9
       Comment: If the user correctly guesses 4 in a row the game will end and tell them they have won.
                However due to it not being specified I did not include a loss feature and therefore have no way for the game to end by a loss.
   11. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I gave myself a mark for each question and included a detailed comment for each.
   Total Mark out of 100 (Add all the previous marks): 98
*/

import java.util.Random;
import java.util.Scanner;

public class Assignment_HiLo {

    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    public static void main(String[] args) {
        int successfulGuesses = 0;
        int randomCard = 0;
        int nextRandomCard = 0;
        String userGuess = "";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Get a random card from 2 to the ACE
        randomCard = random.nextInt(ACE - 1) + 2; //0(inclusive)->13(exclusive) and add 2 to match card constants above

        if(randomCard == JACK) {
            System.out.println("The card is a Jack");
        }
        else if(randomCard == QUEEN) {
            System.out.println("The card is a Queen");
        }
        else if(randomCard == KING) {
            System.out.println("The card is a King");
        }
        else if(randomCard == ACE){
            System.out.println("The card is an Ace");
        }
        else{
            System.out.println("The card is a " + randomCard);
        }

        while(successfulGuesses < 4) {
            //Get a random card from 2 to the ACE
            nextRandomCard = random.nextInt(ACE - 1) + 2; //0(inclusive)->13(exclusive) and add 2 to match card constants above
            System.out.println("Do you think the next card will be higher, lower or equal? ");
            userGuess = scanner.nextLine();

            if(userGuess.equals("higher") || userGuess.equals("lower") || userGuess.equals("equal")) {

                if (userGuess.equals("higher") && nextRandomCard > randomCard) {
                    randomCard = nextRandomCard;
                    successfulGuesses++;
                }
                else if(userGuess.equals("lower") && nextRandomCard < randomCard) {
                    randomCard = nextRandomCard;
                    successfulGuesses++;
                }
                else if(userGuess.equals("equal") && nextRandomCard == randomCard) {
                    randomCard = nextRandomCard;
                    successfulGuesses++;
                }
                else {
                    randomCard = nextRandomCard;
                    successfulGuesses = 0;
                }

                if(nextRandomCard == JACK) {
                    System.out.print("The card is a Jack");
                }
                else if(nextRandomCard == QUEEN) {
                    System.out.print("The card is a Queen");
                }
                else if(nextRandomCard == KING) {
                    System.out.print("The card is a King");
                }
                else if(nextRandomCard == ACE){
                    System.out.print("The card is an Ace");
                }
                else{
                    System.out.print("The card is a " + nextRandomCard);
                }
                System.out.println(" (Current Streak: " + successfulGuesses + ")");
            }
            else {
                System.out.println("INVALID INPUT! Please try again.");
            }

        }
        System.out.println("Congratulations. You got them all correct.");
        scanner.close();
    }
}
