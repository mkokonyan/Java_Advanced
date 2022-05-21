package L05_FunctionalProgramming.b_excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class P03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] intArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);


        Function<Integer[], Integer> getMin = e -> Collections.min(Arrays.asList(e));
        System.out.println(getMin.apply(intArr));

    }
}
