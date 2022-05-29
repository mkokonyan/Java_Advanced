package L05_FunctionalProgramming.b_exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int divisor = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);
        System.out.println(numbers.stream()
                .filter(e -> e % divisor != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
