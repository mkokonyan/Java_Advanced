package L01_StacksAndQueues.a_lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = scanner.nextLine();
        String current = null;
        while (!navigation.equals("Home")) {

            if (navigation.equals("back")) {
                if (!history.isEmpty()) {
                    current = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (current != null) {
                    history.push(current);
                }
                current = navigation;

            }
            System.out.println(current);

            navigation = scanner.nextLine();


        }

    }
}
