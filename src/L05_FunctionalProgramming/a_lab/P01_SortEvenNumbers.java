package L05_FunctionalProgramming.a_lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(", "))
                        .map(Integer::parseInt).toList();

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(e -> e % 2 == 0).toList();



        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));

        String firstOutput = mutator.apply(evenNumbers
                .stream()
        );


        System.out.println(firstOutput);
        String secondOutput = mutator.apply(evenNumbers
                .stream()
                .sorted()
        );
        System.out.println(secondOutput);


    }
}
