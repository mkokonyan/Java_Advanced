package L01_StacksAndQueues.a_lab;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println(0);
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number /= 2;
            }
            System.out.println(stack.stream().map(String::valueOf).collect(Collectors.joining()));

        }
    }
}
