import java.util.Scanner;

public class Tutorial_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many participants are in the competition?: ");
        if (scanner.hasNextInt()) {
            int competitors = scanner.nextInt();
            if(competitors > 1) {
                System.out.print("Prizes should be given to the competitors who come: 1st, ");
                for(int i = 1; i <= competitors; i++) {
                    if(isPrime(i)) {
                        if(i != 11 || i != 13) {
                            switch(i % 10) {
                                case 1:
                                    System.out.print(i + "st ");
                                    break;
                                case 2:
                                    System.out.print(i + "nd ");
                                    break;
                                case 3:
                                    System.out.print(i + "rd ");
                                    break;
                                default:
                                    System.out.print(i + "th ");
                                    break;
                            }
                        }
                        else if(i == 11){
                            System.out.print("11th ");
                        }
                        else {
                            System.out.print("12th ");
                        }

                    }
                }
            }
            else if(competitors < 0) {
                System.out.println("The number you entered was invalid :(");
            }
            else {
                System.out.println("Prizes should be given to the competitors who come: 1st");
            }
        }
        else {
            System.out.println("The number you entered was invalid :(");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        else if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while(i * i <= n) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        return true;
    }
}
