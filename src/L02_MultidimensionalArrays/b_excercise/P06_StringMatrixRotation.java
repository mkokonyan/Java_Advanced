package L02_MultidimensionalArrays.b_excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputData = new ArrayList<>();

        String rotateCommand = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            inputData.add(command);
            command = scanner.nextLine();
        }


        String[][] matrix = createMatrix(inputData);



        int rotationDegrees = Integer.parseInt(rotateCommand.substring(7, rotateCommand.length() - 1));
        rotationDegrees = rotationDegrees < 360 ? rotationDegrees : rotationDegrees - (rotationDegrees / 360) * 360;
        if (rotationDegrees == 90) {
            matrix = rotate90(matrix);
        } else if (rotationDegrees == 180) {
            matrix = rotate180(matrix);
        } else if (rotationDegrees  == 270) {
            matrix = rotate270(matrix);
        }
        printStrMatrix(matrix);
    }

    private static String[][] rotate270(String[][] matrix) {
        String[][] outputMatrix = new String[matrix[0].length][matrix.length];

        int currentCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            String[] rowToAdd = reverseRow(matrix[i]);

            for (int row = 0; row < outputMatrix.length ; row++) {
                for (int col = 0; col < outputMatrix[row].length; col++) {
                    outputMatrix[row][currentCol] = rowToAdd[row];
                }
            }
            currentCol++;
        }
        return outputMatrix;
    }

    private static String[][] rotate180(String[][] matrix) {
        String[][] outputMatrix = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            outputMatrix[matrix.length - 1 - i] = reverseRow(matrix[i]);
        }


        return outputMatrix;
    }

    private static String[][] rotate90(String[][] matrix) {
        String[][] outputMatrix = new String[matrix[0].length][matrix.length];

        int currentCol = outputMatrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            String[] rowToAdd = matrix[i];
            for (int row = 0; row < outputMatrix.length ; row++) {
                for (int col = 0; col < outputMatrix[row].length; col++) {
                    outputMatrix[row][currentCol] = rowToAdd[row];
                }
            }
            currentCol--;
        }
        return outputMatrix;
    }

    public static void printStrMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != null) {
                    System.out.print(matrix[row][col]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static String[][] createMatrix (ArrayList<String> inputList) {
        String[][] matrix = new String[inputList.size()][getMatrixColSize(inputList)];
        for (int i = 0; i <inputList.size(); i++) {
            String[] data = inputList.get(i).split("");
            for (int j = 0; j < data.length; j++) {
                matrix[i][j] = data[j];
            }
        }
        return matrix;
    }

    public static int getMatrixColSize(ArrayList<String> inputList) {
        int maxLength = 0;
        for (String el : inputList) {
            if (el.length() > maxLength) {
                maxLength = el.length();
            }
        }
        return maxLength;
    }

    public static String[] reverseRow(String[] rowArr) {
        for (int i = 0; i < rowArr.length / 2; i++) {
            String temp = rowArr[i];
            rowArr[i] = rowArr[rowArr.length - 1 - i];
            rowArr[rowArr.length - 1 - i] = temp;
        }
        return rowArr;
    }
}
