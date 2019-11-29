import java.util.Scanner;

public class Assignment_Frequencies {

    public static final int NUMBER_OF_DIGITS = 10;
    public static int[] frequencies = new int[NUMBER_OF_DIGITS];

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter a number: ");
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                countDigitFrequencies(input, frequencies);
                printDigitFrequencies(frequencies);
            } else {
                scanner.next();
            }
        }
    }

    public static void countDigitFrequencies(int number, int[] frequencies) {
        while(number > 0) {
            int digit = number % 10;
            frequencies[digit]++;
            number /= 10;
        }
    }

    public static void printDigitFrequencies(int[] frequencies) {
        System.out.print("Digit frequencies: ");
        for(int index = 0; index < frequencies.length; index++) {
            if(frequencies[index] != 0) {
                System.out.print(index + "(" + frequencies[index] + ") ");
            }
        }
    }
}
