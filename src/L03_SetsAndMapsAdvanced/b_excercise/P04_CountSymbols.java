package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> countMap = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            countMap.putIfAbsent(text.charAt(i), 0);
            countMap.put(text.charAt(i), countMap.get(text.charAt(i)) + 1);
        }
        countMap.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
