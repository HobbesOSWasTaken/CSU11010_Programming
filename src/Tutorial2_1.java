import java.util.Scanner;

public class Tutorial2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?:");
        double firstDouble = scanner.nextDouble();
        System.out.println("What is the second number?:");
        double secondDouble = scanner.nextDouble();
        System.out.println("What is the third number?");
        double thirdDouble = scanner.nextDouble();
        scanner.close();

        double average = calculateAverage(firstDouble, secondDouble, thirdDouble);
        System.out.println("The average of your three numbers is " + average);
        double standard_deviation = calculateStandardDeviation(firstDouble, secondDouble, thirdDouble, average);
        System.out.println("The standard deviation of your three numbers is " + standard_deviation);


    }

    public static double calculateAverage(double d1, double d2, double d3) {
        double average = (d1 + d2 +d3) / 3;
        return average;
    }

    public static double calculateStandardDeviation(double d1, double d2, double d3, double average) {
        double standard_deviation = Math.sqrt(
                (Math.pow(d1 - average, 2) + Math.pow(d2 - average, 2) + Math.pow(d3 - average, 2)) / 3
        );
        return standard_deviation;
    }
}
