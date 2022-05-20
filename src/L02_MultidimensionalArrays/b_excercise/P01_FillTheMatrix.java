package L02_MultidimensionalArrays.b_excercise;

import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(inputData[0]);
        String pattern = inputData[1];

        String[][] matrix = pattern.equals("A") ? getAMatrix(matrixSize) : getBMatrix(matrixSize);
        printStrMatrix(matrix);
    }

    private static String[][] getAMatrix(int matrixSize) {
        String[][] matrix = new String[matrixSize][matrixSize];
        int counter = 1;
        int currentColumn = 0;
        for (int col = 0; col < matrixSize; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][currentColumn] = String.valueOf(counter);
                counter++;
            }
            currentColumn++;
        }
        return matrix;
    }


    private static String[][] getBMatrix(int matrixSize) {
        String[][] matrix = new String[matrixSize][matrixSize];
        int counter = 1;
        int currentColumn = 0;
        for (int col = 0; col < matrixSize; col++) {
            if (currentColumn % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][currentColumn] = String.valueOf(counter);
                    counter++;
                }
            } else {
                for (int row = matrix.length-1; row > -1; row--) {
                    matrix[row][currentColumn] = String.valueOf(counter);
                    counter++;
                }
            }
            currentColumn++;
        }

        return matrix;
    }

    public static void printStrMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }
}
