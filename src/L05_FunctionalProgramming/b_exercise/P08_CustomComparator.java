package L05_FunctionalProgramming.b_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> comparator = (first, second) -> {
            if (first% 2 == 0 && second % 2 != 0) {
                return - 1;
            } else if (first % 2 !=0 && second % 2 == 0) {
                return  1;
            } else {
                return first.compareTo(second);
            }
        };
        nums.stream().sorted(comparator).forEach(n -> System.out.print(n + " "));

    }
}
