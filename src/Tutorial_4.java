import java.util.Scanner;

public class Tutorial_4 {
    public static void main(String[] args) {
        System.out.println("What number would you like to know the multiples of?:");
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        System.out.println("What number should the limit be?:");
        int secondInt = scanner.nextInt();
        scanner.close();

        if (firstInt <= 0 || secondInt <= 0) {
            System.out.println("One of the numbers you entered was negative! BAD!");
        }
        else {
            System.out.print("The multiples of " + firstInt + " (up to " + secondInt + ") are ");
            for(int i = 0; i <= (secondInt / firstInt); i++){
                int result = i * firstInt;
                System.out.print(i < (secondInt / firstInt) ? result + ", " : result + ".");
            }
        }

    }
}
