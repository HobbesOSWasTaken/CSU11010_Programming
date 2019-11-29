import java.util.Scanner;

public class Tutorial_5 {

    public static void main(String[] args) {
        System.out.println("Enter a list of numbers separated by spaces (type exit when complete): ");
        Scanner scanner = new Scanner(System.in);
        double minimumNumber = scanner.nextDouble();
        double maximumNumber = minimumNumber;
        if(scanner.hasNextDouble() && scanner.nextLine() != "exit"){
            while(scanner.hasNextDouble()) {
                double currentNumber = scanner.nextDouble();
                if(currentNumber > maximumNumber) {
                    maximumNumber = currentNumber;
                }
                if(currentNumber < minimumNumber) {
                    minimumNumber = currentNumber;
                }

            }
        }

        System.out.println("The max number you entered was: " + maximumNumber);
        System.out.println("The minimum number you entered was: " + minimumNumber);
        scanner.close();
    }
}
