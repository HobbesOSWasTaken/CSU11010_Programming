import java.util.Scanner;

public class Tutorial_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to factorialise: ");
        int input = scanner.nextInt();
        System.out.println(input + "! = " + factorialOf(input));
    }

    public static int factorialOf(int number) {
        if(number == 1) {
            return 1;
        }
        else {
            return number * factorialOf(number - 1);
        }
    }
}
