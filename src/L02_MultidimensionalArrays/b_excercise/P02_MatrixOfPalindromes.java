package L02_MultidimensionalArrays.b_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int matrixRow = matrixData[0];
        int matrixCol = matrixData[1];

        String[][] outputMatrix = new String[matrixRow][matrixCol];

        for (int row = 0; row < matrixRow; row++) {
            for (int col = 0; col < matrixCol; col++) {
                StringBuilder currentString = new StringBuilder();
                char firstAndLastLetter = (char) (97 + row);
                char middleLetter = (char) (97 + row + col);

                outputMatrix[row][col] = currentString.append(firstAndLastLetter).append(middleLetter).append(firstAndLastLetter).toString();
            }
        }
        printStrMatrix(outputMatrix);
    }
    public static void printStrMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }
}
