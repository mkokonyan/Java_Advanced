package L02_MultidimensionalArrays.a_lab;

import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixAttrs = scanner.nextLine().split(" ");
        int firstMatrixRows = Integer.parseInt(firstMatrixAttrs[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixAttrs[1]);
        String[][] firstMatrix = readStrMatrix(firstMatrixRows, scanner, "\\s+");

        String[] secondMatrixAttrs = scanner.nextLine().split(" ");
        int secondMatrixRows = Integer.parseInt(secondMatrixAttrs[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixAttrs[1]);
        String[][] secondMatrix = readStrMatrix(secondMatrixRows, scanner, "\\s+");

        String result = firstMatrixRows == secondMatrixRows && firstMatrixCols == secondMatrixCols ? checkAreEqualMatrices(firstMatrix, secondMatrix) : "not equal";
        System.out.println(result);


    }

    private static String checkAreEqualMatrices(String[][] firstMatrix, String[][] secondMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (!firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    return "not equal";
                }
            }
        }
        return "equal";
    };

    public static String[][] readStrMatrix(int rows, Scanner scanner, String delimiter) {
        String[][] matrix = new String[rows][];
        for (int r = 0; r < matrix.length; r++) {
            String[] row = scanner.nextLine().split(delimiter);
            matrix[r] = row;
        }
        return matrix;
    }
}
