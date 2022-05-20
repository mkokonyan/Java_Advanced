package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, Map<String, Long>> populationMap = new LinkedHashMap<>();

        while (!command.equals("report")) {
            String city = command.split("\\|")[0];
            String country = command.split("\\|")[1];
            long population = Long.parseLong(command.split("\\|")[2]);

            populationMap.putIfAbsent(country, new LinkedHashMap<>());
            Map<String, Long> countryData = populationMap.get(country);
            countryData.putIfAbsent(city, population);

            command = scanner.nextLine();
        }

        populationMap.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    long e1Values = e1.getValue().values().stream().mapToLong(Long::valueOf).sum();
                    long e2Values = e2.getValue().values().stream().mapToLong(Long::valueOf).sum();
                    return (int) (e2Values - e1Values);
                }).forEach(e -> {
                    long totalPopulation = 0;
                    for (String s : e.getValue().keySet()) {
                        totalPopulation += e.getValue().get(s);
                    }
                    System.out.printf("%s (total population: %d)%n", e.getKey(), totalPopulation);


                    e.getValue().entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                            .forEach(e2 -> System.out.printf("=>%s: %d%n", e2.getKey(), e2.getValue()));
                });

    }
}
