package L01_StacksAndQueues.b_exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> deque = new ArrayDeque<>();


        String[] commands = scanner.nextLine().split("\\s+");

        int enqueueElements = Integer.parseInt(commands[0]);
        int dequeElements = Integer.parseInt(commands[1]);
        int checkingNumber = Integer.parseInt(commands[2]);
        String[] sequence = scanner.nextLine().split("\\s+");

        for (int i = 0; i < enqueueElements; i++) {
            deque.add(sequence[i]);
        }
        for (int i = 0; i < dequeElements; i++) {
            deque.poll();
        }
        if (!deque.isEmpty()) {
            if (deque.contains(String.valueOf(checkingNumber))) {
                System.out.println(true);
            } else {
                System.out.println(deque.stream().mapToInt(Integer::valueOf).min().getAsInt());
            }
        } else {
            System.out.println(0);
        }


    }
}
