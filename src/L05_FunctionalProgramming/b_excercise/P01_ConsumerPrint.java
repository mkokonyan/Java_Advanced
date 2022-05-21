package L05_FunctionalProgramming.b_excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printAll = System.out::println;
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(printAll);
    }
}
