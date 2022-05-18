package L01_StacksAndQueues.a_lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        while (stack.size() > 1) {
            int firstElement = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondElement = Integer.parseInt(stack.pop());

            switch (operator) {
                case "+":
                    stack.push(String.valueOf(firstElement + secondElement));
                    break;
                case "-":
                    stack.push(String.valueOf(firstElement - secondElement));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}

