package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.*;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsNumber = Integer.parseInt(scanner.nextLine());

        Set<String> elementsSet = new TreeSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            elementsSet.addAll(Arrays.asList(elements));
        }
        elementsSet.forEach(e -> System.out.printf("%s ", e)) ;

    }
}
