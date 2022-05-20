package L03_SetsAndMapsAdvanced.a_lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class P08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap <String, Double[]> graduationList = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            String[] scoresList = scanner.nextLine().split(" ");
            Double[] studentGrades = new Double[scoresList.length];

            for (int j = 0; j < scoresList.length; j++) {
                studentGrades[j] = Double.parseDouble(scoresList[j]);
            }
            graduationList.put(studentName, studentGrades);
        }
        DecimalFormat gradeFormatter = new DecimalFormat("#.###################");
        graduationList.forEach((key, value) -> {
            double averageGrade = 0;
            for (int i = 0; i < value.length; i++) {
                averageGrade += value[i];
            }
            averageGrade /= value.length;
            System.out.printf("%s is graduated with %s%n", key, gradeFormatter.format(averageGrade));

        });
    }
}
