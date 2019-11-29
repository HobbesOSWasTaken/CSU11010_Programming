import java.util.Scanner;

public class Assignment_HiScores {

    public static int[] highScores;

    public static void main(String[] args) {
        System.out.println("How many highscores would you like to maintain?: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        highScores = new int[response];
        initialiseHighScores(highScores);
        askForScore(highScores);
    }

    public static void askForScore(int[] highScores) {
        System.out.println("What number would you like to add to the highscores?: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        if(insertScore(highScores, response) == false) {
            printHighScores(highScores);
            askForScore(highScores);
        }
        else{
            printHighScores(highScores);
        }


    }

    public static void initialiseHighScores(int[] highScores) {
        for(int score = 0; score < highScores.length; score++) {
            highScores[score] = 0;
        }
    }

    public static void printHighScores(int[] highScores) {
        System.out.print("The high scores are ");
        for(int score = 0; score < highScores.length; score++) {
            System.out.print(highScores[score]);
            if(score < highScores.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.print(". \n");
            }
        }
    }

    public static boolean higherThan(int[] highScores, int addScore) {
        int highestScore = 0;
        for(int score = 0; score < highScores.length; score++) {
            if(highScores[score] > highestScore) {
                highestScore = highScores[score];
            }
        }
        if(addScore > highestScore) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean insertScore(int[] highScores, int addScore) {

        if(higherThan(highScores, addScore)) {
            for(int score = 0; score < highScores.length; score++) {
                if(highScores[score] == 0) {
                    highScores[score] = addScore;
                    return false;
                }
            }
            System.out.println("The highscores list is full!");
            return true;
        }
        return false;
    }


}
