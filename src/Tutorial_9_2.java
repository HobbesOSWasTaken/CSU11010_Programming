import java.util.Scanner;

public class Tutorial_9_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to see if it is a factorian: ");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int input = scanner.nextInt();
            System.out.println(isFactorian(input));
        }

    }

    public static int computeFactorial(int number) {
        if(number == 1) {
            return 1;
        }
        else {
            return number * computeFactorial(number - 1);
        }
    }

    public static boolean isFactorian(int number) {
        int answer = 0;
        int inputCopy = number;
        while(number > 1) {
            int remainder = number % 10;
            number = number / 10;
            answer += computeFactorial(remainder);
        }
        if(inputCopy == answer) {
            return true;
        }
        else {
            return false;
        }
    }
}
