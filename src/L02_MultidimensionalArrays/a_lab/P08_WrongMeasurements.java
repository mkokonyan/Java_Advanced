package L02_MultidimensionalArrays.a_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixRows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readIntMatrix(matrixRows, scanner, " ");

        String[] initialWrongNumData = scanner.nextLine().split(" ");
        int wrongNumberRow =Integer.parseInt( initialWrongNumData[0]);
        int wrongNumberCol =Integer.parseInt( initialWrongNumData[1]);

        int numberToBeReplaced = matrix[wrongNumberRow][wrongNumberCol];

        ArrayList<int[]> wrongNumbersCoords = new ArrayList<>();
        int [][] outputMatrix = new int[matrixRows][];

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToBeReplaced) {
                    wrongNumbersCoords.add(new int[]{row, col});
                    matrix[row][col] = 0;
                }
            }
            outputMatrix[row] =  matrix[row].clone();
        }



        for (int i = 0; i < wrongNumbersCoords.size(); i++) {
            int currentRow = wrongNumbersCoords.get(i)[0];
            int currentCol = wrongNumbersCoords.get(i)[1];

            int newValue = 0;

            newValue += isValidIndex(currentRow-1, currentCol, matrix) ? matrix[currentRow-1][currentCol] : 0;
            newValue += isValidIndex(currentRow+1, currentCol, matrix) ? matrix[currentRow+1][currentCol] : 0;
            newValue += isValidIndex(currentRow, currentCol-1, matrix) ? matrix[currentRow][currentCol-1] : 0;
            newValue += isValidIndex(currentRow, currentCol+1, matrix) ? matrix[currentRow][currentCol+1] : 0;

            outputMatrix[currentRow][currentCol] = newValue;
        }

        printIntMatrix(outputMatrix);

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

    public static boolean isValidIndex (int row, int col, int[][] matrix) {
        return 0 <= row && row < matrix.length  && 0 <= col && col < matrix[row].length;
    }
}
