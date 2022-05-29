package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.*;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<Integer> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < numbers[0]; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));

        }

        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < numbers[1]; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(e -> System.out.printf("%d ", e));
    }
}
