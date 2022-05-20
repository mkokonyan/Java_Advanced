package L03_SetsAndMapsAdvanced.a_lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(e -> System.out.printf("%d ", e));
    }
}
