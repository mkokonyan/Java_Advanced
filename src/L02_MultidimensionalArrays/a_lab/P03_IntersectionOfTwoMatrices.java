package L02_MultidimensionalArrays.a_lab;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixRows = Integer.parseInt(scanner.nextLine());
        int matrixCols = Integer.parseInt(scanner.nextLine());
        String[][] firstMatrix = readStrMatrix(matrixRows, scanner, "\\s+");
        String[][] secondMatrix = readStrMatrix(matrixRows, scanner, "\\s+");

        String[][] resultMatrix = new String[matrixRows][matrixCols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    resultMatrix[row][col] = firstMatrix[row][col];
                } else {
                    resultMatrix[row][col] = "*";
                }
            }
        }
        printStrMatrix(resultMatrix);
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
