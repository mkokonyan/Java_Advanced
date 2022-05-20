package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.*;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, String> emailMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String name = command;
            String email = scanner.nextLine();
            if (!email.toLowerCase().contains(".us")
                    && !email.toLowerCase().contains(".uk")
                    && !email.toLowerCase().contains(".com")) {
                emailMap.put(name, email);
            }

            command = scanner.nextLine();

        }
        emailMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
