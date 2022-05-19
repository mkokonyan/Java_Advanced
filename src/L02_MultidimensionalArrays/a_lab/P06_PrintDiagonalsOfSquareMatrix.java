package L02_MultidimensionalArrays.a_lab;

import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixRows = Integer.parseInt(scanner.nextLine());
        String[][] matrix = readStrMatrix(matrixRows, scanner, "\\s+");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = matrix.length-1; i > -1; i--) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
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
    public static void printStrMatrix (String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }
}
