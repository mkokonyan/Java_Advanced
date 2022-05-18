package L01_StacksAndQueues.a_lab;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>(List.of(scanner.nextLine().split(" ")));
        int tossesCount = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (stack.size() > 1) {
            for (int i = 1; i < tossesCount; i++) {
                stack.offer(stack.poll());
            }

            if (isPrime(cycle)) {
                System.out.printf("Prime %s%n", stack.peek());
            } else {
                System.out.printf("Removed %s%n", stack.poll());
            }
            cycle++;
        }
        System.out.printf("Last is %s", stack.poll());
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
