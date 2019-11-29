import java.util.Scanner;

public class Tutorial_8 {

    public static final int MONTHS_IN_YEAR = 12;
    public static final int FEBRUARY = 28;
    public static final int LEAP_FEBRUARY = 29;
    public static final int MONTHS_WITH_30 = 30;
    public static final int MONTHS_WITH_31 = 31;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will check if a date is valid or not");
        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();
        System.out.println("Please enter a month: ");
        int month = scanner.nextInt();
        System.out.println("Please enter a day: ");
        int day = scanner.nextInt();
        if(validDate(day, month, year)) {
            System.out.println("That is an valid date!");
        }
        else {
            System.out.print(" therefore that is not a valid date!");
        }
        scanner.close();
    }
    public static boolean validDate(int day, int month, int year) {
        if(month >= 1 && month <= MONTHS_IN_YEAR) {
            if(day >= 1 && day <= daysInMonth(month, year)){
                return true;
            }
            else {
                System.out.print("Invalid day");
                return false;
            }
        }
        else {
            System.out.println("Invalid month");
            return false;
        }
    }

    public static int daysInMonth(int month, int year) {
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return MONTHS_WITH_31;
            case 4:
            case 6:
            case 9:
            case 11:
                return MONTHS_WITH_30;
            case 2:
                if(isLeapYear(year)) {
                    return LEAP_FEBRUARY;
                }
                else{
                    return FEBRUARY;
                }
        }
        return 0;
    }
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                return true;
            }
            else if(year % 400 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
