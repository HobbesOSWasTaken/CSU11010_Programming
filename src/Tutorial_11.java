import java.util.Scanner;

public class Tutorial_11 {

    public static double[] marks;
    public static double FIRST_CLASS = 70;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a student percentage: ");
            if (scanner.hasNextDouble()) {
                double percentage = scanner.nextDouble();
                if (marks != null) {
                    double[] temp = new double[marks.length + 1];
                    for (int index = 0; index < marks.length; index++) {
                        temp[index] = marks[index];
                    }
                    marks = temp;
                    marks[marks.length - 1] = percentage;
                } else {
                    marks = new double[1];
                    marks[0] = percentage;
                }
                System.out.println(countFirstClassHonours(marks) + " students obtained first class honours. The highest mark was " + determineBestMark(marks));
            } else {
                scanner.next();
            }

        }
    }

    public static double determineBestMark(double[] marks) {
        double highest = 0;
        for(int index = 0; index < marks.length; index++) {
            if(marks[index] > highest) {
                highest = marks[index];
            }
        }
        return highest;
    }

    public static int countFirstClassHonours(double[] marks) {
        int count = 0;
        for (int index = 0; index < marks.length; index++) {
            if (marks[index] > FIRST_CLASS) {
                count++;
            }
        }
        return count;
    }
}
