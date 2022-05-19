package L02_MultidimensionalArrays.a_lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(", ");
        int matrixRows = Integer.parseInt(matrixData[0]);
        int[][] matrix = readIntMatrix(matrixRows, scanner, ", ");

        int[][] outputMatrix = new int[2][2];

        int maxResult = Integer.MIN_VALUE;
        int currentMatrixSum = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int topLeft = matrix[row][col];
                int topRight = matrix[row][col+1];
                int bottomLeft = matrix[row+1][col];
                int bottomRight = matrix[row+1][col+1];
                currentMatrixSum = topLeft + topRight + bottomLeft + bottomRight;
                if (currentMatrixSum > maxResult) {
                    maxResult = currentMatrixSum;
                    outputMatrix = new int[][]{
                            {topLeft, topRight},
                            {bottomLeft, bottomRight},
                    };
                }
            }

        }
        printIntMatrix(outputMatrix);
        System.out.println(maxResult);

    }

    public static int[][] readIntMatrix(int rows, Scanner scanner, String delimiter) {
        int[][] matrix = new int[rows][];
        for (int r = 0; r < matrix.length; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split(delimiter)).mapToInt(Integer::parseInt).toArray();
            matrix[r] = row;
        }
        return matrix;
    }

    public static void printIntMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.stream(ints).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
