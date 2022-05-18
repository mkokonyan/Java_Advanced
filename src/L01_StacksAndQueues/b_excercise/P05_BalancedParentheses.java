package L01_StacksAndQueues.b_excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputSeq = scanner.nextLine().split("");
        ArrayDeque<String> checkStack = new ArrayDeque<>();
        String openingBrackets = "{[(";
        String closingBrackets = "}])";
        boolean isBalanced = true;

        for (String s : inputSeq) {
            if (openingBrackets.contains(s)) {
                checkStack.push(s);
            } else {

                if (!checkStack.isEmpty() && closingBrackets.indexOf(s.charAt(0)) == openingBrackets.indexOf(checkStack.peek())) {
                    checkStack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced && checkStack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
