package L01_StacksAndQueues.b_exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        List<Integer> seq = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        seq.forEach(stack::push);

        System.out.println(stack.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
