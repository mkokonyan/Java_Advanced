package L02_MultidimensionalArrays.a_lab;

import java.util.Scanner;

public class P07_FindTheRealQueen {
    private static final int MATRIX_SIZE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MATRIX_SIZE = 8;
        String[][] matrix = readStrMatrix(MATRIX_SIZE, scanner, "\\s+");
        System.out.println(getRealQueenCoords(matrix));

    }

    public static String getRealQueenCoords (String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("q")) {
                    if (isValidHorizontal(row, matrix) && isValidVertical(col, matrix) && isValidTopLeftDiagonal(row, col, matrix)
                    && isValidTopRightDiagonal(row, col, matrix) && isValidBottomRightDiagonal(row, col, matrix) && isValidBottomLeftDiagonal(row, col, matrix)) {
                        return String.format("%d %d", row, col);
                    }
                }
            }
        }
        return "not found";
    }

    public static String[][] readStrMatrix(int rows, Scanner scanner, String delimiter) {
        String[][] matrix = new String[rows][];
        for (int r = 0; r < matrix.length; r++) {
            String[] row = scanner.nextLine().split(delimiter);
            matrix[r] = row;
        }
        return matrix;
    }


    public static boolean isValidHorizontal(int row, String[][] matrix) {
        int queenCounter = 0;
        for (int col = 0; col < MATRIX_SIZE; col++) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
        }
        return queenCounter == 1;
    }

    public static boolean isValidVertical(int col, String[][] matrix) {
        int queenCounter = 0;
        for (int row = 0; row < MATRIX_SIZE; row++) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
        }
        return queenCounter == 1;
    }

    public static boolean isValidTopRightDiagonal(int row, int col, String[][] matrix) {
        int queenCounter = 0;
        row--;
        col++;
        while (isValidIndex(row, col)) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
            row--;
            col++;
        }
        return queenCounter == 0;
    }

    public static boolean isValidTopLeftDiagonal(int row, int col, String[][] matrix) {
        int queenCounter = 0;
        row--;
        col--;
        while (isValidIndex(row, col)) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
            row--;
            col--;
        }
        return queenCounter == 0;
    }

    public static boolean isValidBottomRightDiagonal(int row, int col, String[][] matrix) {
        int queenCounter = 0;
        row++;
        col++;
        while (isValidIndex(row, col)) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
            row++;
            col++;
        }
        return queenCounter == 0;
    }

    public static boolean isValidBottomLeftDiagonal(int row, int col, String[][] matrix) {
        int queenCounter = 0;
        row++;
        col--;
        while (isValidIndex(row, col)) {
            if (matrix[row][col].equals("q")) {
                queenCounter++;
            }
            row++;
            col--;
        }
        return queenCounter == 0;
    }

    public static boolean isValidIndex (int row, int col) {
        return 0 <= row && row < MATRIX_SIZE  && 0 <= col && col < MATRIX_SIZE;
    }
}
