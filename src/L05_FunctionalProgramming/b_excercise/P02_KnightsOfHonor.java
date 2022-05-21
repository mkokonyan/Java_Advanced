package L05_FunctionalProgramming.b_excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String> addSir = str -> System.out.println("Sir "+ str);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(addSir);

    }

}
