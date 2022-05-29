package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_SrbskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = "(?<singer>[A-Za-z]+(\\s[A-Za-z]+)*) @(?<venue>[A-Za-z]+(\\s[A-Za-z]+)*) (?<ticketPrice>\\d+) (?<ticketCount>\\d+)";

        Pattern pattern = Pattern.compile(expression);
        String command = scanner.nextLine();

        Map<String, Map<String, Integer>> venuesMap = new LinkedHashMap<>();


        while (!command.equals("End")) {
            Matcher matcher = pattern.matcher(command);

            if (matcher.find()) {
                String singer = matcher.group("singer");
                String venue = matcher.group("venue");
                int ticketPrice = Integer.parseInt(matcher.group("ticketPrice"));
                int ticketCount = Integer.parseInt(matcher.group("ticketCount"));
                int concertPrice = ticketPrice * ticketCount;

                venuesMap.putIfAbsent(venue, new LinkedHashMap<>());
                Map<String, Integer> venueData = venuesMap.get(venue);
                venueData.putIfAbsent(singer, 0);
                venueData.put(singer, venueData.get(singer) + concertPrice);
            }

            command = scanner.nextLine();
        }

        venuesMap.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(e-> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
        });

    }
}
