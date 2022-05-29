package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> namesSet = new LinkedHashSet<>();
        int numberOfNames = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfNames; i++) {
            namesSet.add(scanner.nextLine());
        }
        namesSet.forEach(System.out::println);
    }
}
