package L01_StacksAndQueues.a_lab;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>(List.of(scanner.nextLine().split(" ")));
        int tossesCount = Integer.parseInt(scanner.nextLine());
        while (stack.size() > 1) {
            for (int i = 1; i < tossesCount; i++) {
                stack.offer(stack.poll());
            }
            System.out.printf("Removed %s%n", stack.poll());
        }
        System.out.printf("Last is %s", stack.poll());
    }
}
