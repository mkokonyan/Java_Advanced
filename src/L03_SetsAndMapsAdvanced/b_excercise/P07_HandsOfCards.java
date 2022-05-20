package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.*;

public class P07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Set<String>> playersMap = new LinkedHashMap<>();


        while (!command.equals("JOKER")) {
            String playerName = command.split(": ")[0];
            String[] playerCards = command.split(": ")[1].split(", ");
            playersMap.putIfAbsent(playerName, new HashSet<>());

            for (String playerCard : playerCards) {
                Set<String> playerSet = playersMap.get(playerName);
                playerSet.add(playerCard);
            }
            command = scanner.nextLine();
        }


        playersMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, getPoints(value)));
    }

    public static int getPoints(Set<String> playerDeck) {
        Map<String, Integer> powerData = new HashMap<>() {{
            put("J", 11);
            put("Q", 12);
            put("K", 13);
            put("A", 14);
            put("S", 4);
            put("H", 3);
            put("D", 2);
            put("C", 1);
        }};

        int totalPoints = 0;

        for (String card : playerDeck) {
            if (card.length()==3) {
              totalPoints += 10 * powerData.get(String.valueOf(card.charAt(2)));
            } else {
                totalPoints += Character.isDigit(card.charAt(0))
                        ? Integer.parseInt(String.valueOf(card.charAt(0))) * powerData.get(String.valueOf(card.charAt(1)))
                        : powerData.get(String.valueOf(card.charAt(0))) * powerData.get(String.valueOf(card.charAt(1)));
            }

        }
        return totalPoints;
    }
}


