package L03_SetsAndMapsAdvanced.a_lab;

import com.sun.java.accessibility.util.GUIInitializedListener;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> guests = new TreeSet<>();

        while (!input.equals("PARTY")) {
            guests.add(input);
            input = scanner.nextLine();
        }
        String guest = scanner.nextLine();
        while (!guest.equals("END")) {
            guests.remove(guest);
            guest = scanner.nextLine();

        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));

    }
}
