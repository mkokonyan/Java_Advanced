package L01_StacksAndQueues.b_excercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        int[] numbers =  Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands[0]; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < commands[1]; i++) {
            stack.pop();
        }
        if (!stack.isEmpty()) {
            if (stack.contains(commands[2])) {
                System.out.println(true);
            } else {
                System.out.println(stack.stream().min(Integer::compare).get());
            }
        } else {
            System.out.println(0);
        }
    }
}
