package L02_MultidimensionalArrays.b_exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixRows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readIntMatrix(matrixRows, scanner, "\\s+");

        int result = 0;
        for (int row = 0; row < matrix.length; row++) {
            result += matrix[row][row];
        }
        for (int row = matrix.length-1; row > -1; row--) {
            result -= matrix[row][matrix.length - 1 - row];
        }
        System.out.println(Math.abs(result));

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
}
