package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, String> phonebookMap = new LinkedHashMap<>();

        while(!command.equals("search")) {
             String name = command.split("-")[0];
             String number = command.split("-")[1];
             phonebookMap.put(name, number);

             command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("stop")) {
            String name = command;
            if (phonebookMap.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebookMap.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            command = scanner.nextLine();
        }

    }
}
