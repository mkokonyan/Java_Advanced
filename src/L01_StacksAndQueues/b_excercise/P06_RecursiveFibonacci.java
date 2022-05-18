package L01_StacksAndQueues.b_excercise;

import java.util.Scanner;

public class P06_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(recFib(Long.parseLong(scanner.nextLine())));
    }
    public static int recFib (long num) {
        if (num < 2) {
            return 1;
        } else {
            return recFib(num-1) + recFib(num - 2);
        }
    }
}
