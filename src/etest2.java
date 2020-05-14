import java.util.Scanner;

public class etest2 {

    public static int[] integers;
    public static int FIRST_ELEMENT = 0;

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter an integer to add to the array (or 'quit' to finish): ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                //Increase array size by 1 and add input
                if(integers != null) {
                    int[] tempArray = new int[integers.length + 1];
                    for(int index = 0; index < integers.length; index++) {
                        tempArray[index] = integers[index];
                    }
                    integers = tempArray;
                    integers[integers.length - 1] = input;
                }
                else {
                    integers = new int[1];
                    integers[FIRST_ELEMENT] = input;
                }

                System.out.print("The average value is " + getAverage(integers));
                if(isIncreasing(integers)) {
                    System.out.print(", and all values are increasing.\n");
                }
                else {
                    System.out.print(", and all values are not increasing.\n");
                }
            }
            else {
                String input = scanner.nextLine();
                if(input.equals("quit")) {
                    System.out.println("The program will now exit!");
                    break;
                }
                else {
                    System.out.println("Invalid input!");
                }
            }

        }
    }

    public static double getAverage(int[] integers) {
        if(integers != null) {
            double count = 0;
            double total = 0;
            for(int index = 0; index < integers.length; index++) {
                total += integers[index];
                count++;
            }
            return total/count; //average
        }
        else {
            return 0;
        }
    }

    public static boolean isIncreasing(int[] integers) {
        int currentInt = 0;
        int previousInt = 0;
        if(integers != null) {
            if(integers.length > 1) {
                currentInt = integers[FIRST_ELEMENT];
                for(int index = 1; index < integers.length; index++) {
                    previousInt = currentInt;
                    currentInt = integers[index];
                    if(previousInt >= currentInt) {
                        return false;
                    }
                }
                return true;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
