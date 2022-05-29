package L02_MultidimensionalArrays.b_exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(" ");
        int matrixRows = Integer.parseInt(matrixData[0]);
        int matrixCols = Integer.parseInt(matrixData[1]);

        int[][] matrix = readIntMatrix(matrixRows, scanner, "\\s+");
        int[][] maxResultMatrix = new int[3][3];


        int maxResult = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[row].length-2; col++) {
                int[][] currentMatrix = get3x3Matrix(row, col, matrix);
                int currentResult = getMatrixSum(row, col, currentMatrix);
                if (currentResult > maxResult) {
                    maxResultMatrix = currentMatrix;
                    maxResult = currentResult;
                }
            }
        }

        System.out.printf("Sum = %d%n", maxResult);

        printIntMatrix(maxResultMatrix);

    }

    private static int[][] get3x3Matrix(int row, int col, int[][] matrix) {
        int[][] outputMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                outputMatrix[i][j] = matrix[i+row][j+col];
            }
        }
        return outputMatrix;
    }



    public static int[][] readIntMatrix (int rows, Scanner scanner, String delimiter) {
        int[][] matrix = new int[rows][];
        for (int r = 0; r < matrix.length; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split(delimiter)).mapToInt(Integer::parseInt).toArray();
            matrix[r] = row;
        }
        return matrix;
    }

    public static void printIntMatrix (int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.stream(ints).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    public static int getMatrixSum (int row, int col, int[][] matrix) {
        int totalSum = 0;
        for (int i = 0; i < 3; i++) {
            totalSum += Arrays.stream(matrix[i]).sum();
        }

        return totalSum;
    }

}
