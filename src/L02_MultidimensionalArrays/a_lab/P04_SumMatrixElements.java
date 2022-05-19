package L02_MultidimensionalArrays.a_lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(", ");
        int matrixRows = Integer.parseInt(matrixData[0]);
        int matrixCols = Integer.parseInt(matrixData[1]);
        int[][] matrix = readIntMatrix(matrixRows, scanner, ", ");

        int totalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            totalSum += Arrays.stream(matrix[row]).sum();
        }

        System.out.println(matrixRows);
        System.out.println(matrixCols);
        System.out.println(totalSum);

    }

    public static int[][] readIntMatrix (int rows, Scanner scanner, String delimiter) {
        int[][] matrix = new int[rows][];
        for (int r = 0; r < matrix.length; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split(delimiter)).mapToInt(Integer::parseInt).toArray();
            matrix[r] = row;
        }
        return matrix;
    }
}
