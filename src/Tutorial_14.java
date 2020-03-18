import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial_14 {
    // N Queens Problem (Usually 8 Queens)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many queens would you like to place?: ");
        int queens = scanner.nextInt();
        ArrayList<ArrayList<Integer>> board = getQueens(queens);
    }

    private static ArrayList<ArrayList<Integer>> getQueens(int queens) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solveQueens(queens, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private static void solveQueens(int queens, int row, ArrayList<Integer> columns, ArrayList<ArrayList<Integer>> result) {
        if(row == queens) {
            result.add(new ArrayList<Integer>(columns));
        }
        else {
            for(int column = 0; column < queens; column++) {
                columns.add(column);
                if(isValidPlacement(columns)) {
                    solveQueens(queens, row  + 1, columns, result);
                }
                columns.remove(columns.size() - 1);
            }
        }
    }

    private static boolean isValidPlacement(ArrayList<Integer> columns) {
        return true;
    }
}
