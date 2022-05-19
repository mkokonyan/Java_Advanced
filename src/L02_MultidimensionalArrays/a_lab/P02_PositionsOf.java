package L02_MultidimensionalArrays.a_lab;

import java.util.ArrayList;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixAttributes = scanner.nextLine().split(" ");
        int matrixRows = Integer.parseInt(matrixAttributes[0]);
        String[][] matrix = readStrMatrix(matrixRows, scanner, "\\s+");
        String searchedNumber = scanner.nextLine();

        ArrayList<int[]> resultList = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals(searchedNumber)) {
                    resultList.add(new int[]{row, col});
                }
            }
        }
        if (!resultList.isEmpty()) {
            resultList.forEach(e-> System.out.printf("%d %d%n", e[0], e[1]));
        } else {
            System.out.println("not found");
        }


    }
    public static String[][] readStrMatrix (int rows, Scanner scanner, String delimiter) {
        String[][] matrix = new String[rows][];
        for (int r = 0; r < matrix.length; r++) {
            String[] row = scanner.nextLine().split(delimiter);
            matrix[r] = row;
        }
        return matrix;
    }
}
