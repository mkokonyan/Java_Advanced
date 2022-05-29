package L05_FunctionalProgramming.b_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        List<Integer> divisorSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> checkDivisor = e -> sequenceCheck(divisorSequence, e);

        System.out.println(IntStream.range(1, range + 1).filter(e -> checkDivisor.test(e)).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static boolean sequenceCheck(List<Integer> seq, Integer num) {
        for (Integer div : seq) {
            if (num % div != 0) {
                return false;
            }
        }
        ;
        return true;
    }

    ;
}
