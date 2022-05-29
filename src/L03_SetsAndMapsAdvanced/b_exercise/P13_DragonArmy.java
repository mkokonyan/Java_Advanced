package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.*;

public class P13_DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heroesCount = Integer.parseInt(scanner.nextLine());

        Map<String, String> DEFAULT_VALUES = new HashMap<>();
        DEFAULT_VALUES.put("health", "250");
        DEFAULT_VALUES.put("damage", "45");
        DEFAULT_VALUES.put("armor", "10");

        Map<String, Map<String, Map<String, Integer>>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < heroesCount; i++) {
            String[] heroData = scanner.nextLine().split(" ");
            String type = heroData[0];
            String name = heroData[1];
            String damage = !heroData[2].equals("null") ? heroData[2] : DEFAULT_VALUES.get("damage");
            String health = !heroData[3].equals("null") ? heroData[3] : DEFAULT_VALUES.get("health");
            String armor = !heroData[4].equals("null") ? heroData[4] : DEFAULT_VALUES.get("armor");

            heroesMap.putIfAbsent(type, new TreeMap<>());
            Map<String, Map<String, Integer>> typeHeroes = heroesMap.get(type);
            typeHeroes.putIfAbsent(name, new LinkedHashMap<>());
            Map<String, Integer> heroStats = typeHeroes.get(name);
            heroStats.put("damage", Integer.parseInt(damage));
            heroStats.put("health", Integer.parseInt(health));
            heroStats.put("armor", Integer.parseInt(armor));
        }
        for (Map.Entry<String, Map<String, Map<String, Integer>>> type : heroesMap.entrySet()) {
            double damageStats = 0;
            double healthStats = 0;
            double armorStats = 0;
            for (Map.Entry<String, Map<String, Integer>> heroName : type.getValue().entrySet()) {
                damageStats += heroName.getValue().get("damage");
                healthStats += heroName.getValue().get("health");
                armorStats += heroName.getValue().get("armor");

            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",
                    type.getKey(),
                    damageStats / type.getValue().size(),
                    healthStats / type.getValue().size(),
                    armorStats / type.getValue().size()
            );

            for (Map.Entry<String, Map<String, Integer>> heroName : type.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        heroName.getKey(),
                        heroName.getValue().get("damage"),
                        heroName.getValue().get("health"),
                        heroName.getValue().get("armor")
                );

            }

        }
    }
}
