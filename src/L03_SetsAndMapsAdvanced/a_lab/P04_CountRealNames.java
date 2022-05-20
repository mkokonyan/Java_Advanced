package L03_SetsAndMapsAdvanced.a_lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> linkMap = new LinkedHashMap<>();

        for (double number : numbers) {
            linkMap.putIfAbsent(number, 0);
            linkMap.put(number,linkMap.get(number)+1);
        }

        linkMap.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
