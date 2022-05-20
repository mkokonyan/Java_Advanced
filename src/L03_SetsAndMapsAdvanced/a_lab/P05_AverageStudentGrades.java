package L03_SetsAndMapsAdvanced.a_lab;

import java.util.*;

public class P05_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> gradeMap = new TreeMap<>();

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String studentName = studentInfo[0];
            double studentGrade = Double.parseDouble(studentInfo[1]);
            gradeMap.putIfAbsent(studentName, new ArrayList<>());
            List<Double> studentGrades = gradeMap.get(studentName);
            studentGrades.add(studentGrade);
        }
        gradeMap.forEach((key, value) -> {
            System.out.printf("%s -> ", key);
            value.forEach(e -> System.out.printf("%.2f ", e));
//            double average = 0.00;
//            for (int i = 0; i < value.size(); i++) {
//                average += value.get(i);
//            }
//            average /= value.size();
            System.out.printf("(avg: %.2f)%n", value.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
        });

    }
}
