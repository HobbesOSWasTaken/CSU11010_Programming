package Tutorial_Hanoi;

import java.util.Scanner;

public class Tutorial_Hanoi {

    private static Disk[] rod1;
    private static Disk[] rod2;
    private static Disk[] rod3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many disks do you want to place on the tower?: ");
        int disksCount = scanner.nextInt();
        rod1 = new Disk[disksCount];
        for (int index = 0; index < disksCount; index++) {
            rod1[index] = new Disk();
            rod1[index].setSize(index);
        }
    }

}
