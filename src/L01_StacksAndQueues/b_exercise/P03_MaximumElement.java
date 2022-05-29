package L01_StacksAndQueues.b_exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < numOfCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    stack.push(command[1]);
                    break;
                case "2":
                    stack.pop();
                    break;
                case"3":
                    System.out.println(stack.stream().mapToInt(Integer::valueOf).max().getAsInt());
            }
        }
    }
}
