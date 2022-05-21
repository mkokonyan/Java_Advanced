package L05_FunctionalProgramming.b_excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06_PredicateTheNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int predicateLength = Integer.parseInt(scanner.nextLine());
        String[] inputNames = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = e -> e.length() <= predicateLength;
        System.out.println(Arrays.stream(inputNames)
                .filter(predicate)
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
