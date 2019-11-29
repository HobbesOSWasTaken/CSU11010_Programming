import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Assignment_Cipher {

    public static final int NUMBER_OF_CHARACTERS = 27;
    public static final int ASCII_DIFFERENCE = 97;
    public static final int ASCII_SPACE_DIFFERENCE = 6;
    public static String characters = "abcdefghijklmnopqrstuvwxyz ";
    public static char[] mapping = new char[NUMBER_OF_CHARACTERS];
    public static char[] input;

    public static void main(String args[]) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.print("Input: " + userInput.toLowerCase());

        input = userInput.toLowerCase().toCharArray();
        mapping = createCipher(mapping);
        encrypt(input, mapping);

        System.out.print("\nMapping: ");
        for(int index = 0; index < mapping.length; index++) {
            System.out.print(mapping[index]);
        }
        System.out.print("\nEncrypted String: ");
        for(int index = 0; index < input.length; index++) {
            System.out.print(input[index]);
        }

        input = decrypt(input, mapping);
        System.out.print("\nDecrypted String: ");
        for(int index = 0; index < input.length; index++) {
            System.out.print(input[index]);
        }

    }

    public static char[] createCipher(char[] mapping) {
        mapping = characters.toCharArray();
        Random generator = new Random();

        for(int index = 0; index < mapping.length; index++) {
            int randomPos = generator.nextInt(mapping.length);
            char temp = mapping[index];
            mapping[index] = mapping[randomPos];
            mapping[randomPos] = temp;
        }
        return mapping;
    }

    public static void encrypt(char[] input, char[] mapping) {
        for(int index = 0; index < input.length; index++) {
            if(input[index] != ' ') {
                int charIndex = (int)input[index] - ASCII_DIFFERENCE;
                input[index] = mapping[charIndex];
            }
            else {
                int charIndex = (int)input[index] - ASCII_SPACE_DIFFERENCE;
                input[index] = mapping[charIndex];
            }
        }
    }

    public static char[] decrypt(char[] input, char[] mapping) {
        char[] alphabet = characters.toCharArray();
        char[] tempInput = new char[input.length];
        for(int index = 0; index < input.length; index++) {
            for(int charIndex = 0; charIndex < mapping.length; charIndex++) {
                if(input[index] == mapping[charIndex]) {
                    tempInput[index] = alphabet[charIndex];
                }
            }
        }
        return tempInput;
    }

}
