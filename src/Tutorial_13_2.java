import java.util.Scanner;

public class Tutorial_13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("The greatest common divisor (GCD) by iteration is: " + iterativeEuclideanAlgorithm(a, b));
        System.out.println("The greatest common divisor (GCD) by recursion is: " + recursiveEuclideanAlgorithm(a, b));
    }

    public static int iterativeEuclideanAlgorithm(int a, int b) {
        int temp = 0;
        if(a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int recursiveEuclideanAlgorithm(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return recursiveEuclideanAlgorithm(b, a % b);
        }
    }
}
