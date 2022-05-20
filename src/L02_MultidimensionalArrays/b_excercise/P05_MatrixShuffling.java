package L02_MultidimensionalArrays.b_excercise;

import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(" ");
        int matrixRows = Integer.parseInt(matrixData[0]);
        int matrixCols = Integer.parseInt(matrixData[1]);
        String[][] matrix = readStrMatrix(matrixRows, scanner, " ");

        String command = scanner.nextLine();
        while (!command.equals("END")) {

            if (isValidInput(command, matrixRows, matrixCols)) {
                int firstElRow = Integer.parseInt(command.split(" ")[1]);
                int firstElCol = Integer.parseInt(command.split(" ")[2]);
                int secondElRow = Integer.parseInt(command.split(" ")[3]);
                int secondELCol = Integer.parseInt(command.split(" ")[4]);
                doSwap(firstElRow, firstElCol, secondElRow, secondELCol, matrix);
                printStrMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static boolean isValidInput(String command, int maxRows, int maxCols) {
        String[] commandData = command.split(" ");
        if (commandData.length != 5) {
            return false;
        }
        if (!commandData[0].equals("swap")) {
            return false;
        }
        return isValidIndex(commandData[1], maxRows) && isValidIndex(commandData[2], maxCols)
                && isValidIndex(commandData[3], maxRows) && isValidIndex(commandData[4], maxCols);
    }

    private static void doSwap(int firstElRow, int firstElCol, int secondElRow, int secondELCol, String[][] matrix) {
        String temp = matrix[firstElRow][firstElCol];
        matrix[firstElRow][firstElCol] = matrix[secondElRow][secondELCol];
        matrix[secondElRow][secondELCol] = temp;

    }


    public static String[][] readStrMatrix(int rows, Scanner scanner, String delimiter) {
        String[][] matrix = new String[rows][];
        for (int r = 0; r < matrix.length; r++) {
            String[] row = scanner.nextLine().split(delimiter);
            matrix[r] = row;
        }
        return matrix;
    }

    public static void printStrMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }

    public static boolean isValidIndex(String val, int maxValue) {
        int valToInt = Integer.parseInt(val);
        return 0 <= valToInt && valToInt < maxValue;
    }


}
