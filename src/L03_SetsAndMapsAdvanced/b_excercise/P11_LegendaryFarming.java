package L03_SetsAndMapsAdvanced.b_excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P11_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new TreeMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        Map<String, Integer> junkItems = new TreeMap<>();

        String[] materials = scanner.nextLine().split("\\s+");

        boolean isObtained = false;
        while (true) {

            for (int i = 0; i < materials.length - 1; i += 2) {
                String material = materials[i + 1].toLowerCase();
                int materialCount = Integer.parseInt(materials[i]);
                if (material.equals("shards")) {
                    legendaryItems.put(material, legendaryItems.get("shards") + materialCount);
                    if (legendaryItems.get("shards") >= 250) {
                        legendaryItems.put(material, legendaryItems.get("shards") - 250);
                        System.out.println("Shadowmourne obtained!");
                        isObtained = true;
                        break;
                    }
                } else if (material.equals("fragments")) {
                    legendaryItems.put(material, legendaryItems.get("fragments") + materialCount);
                    if (legendaryItems.get("fragments") >= 250) {
                        legendaryItems.put(material, legendaryItems.get("fragments") - 250);
                        System.out.println("Valanyr obtained!");
                        isObtained = true;
                        break;
                    }
                } else if (material.equals("motes")) {
                    legendaryItems.put(material, legendaryItems.get("motes") + materialCount);
                    if (legendaryItems.get("motes") >= 250) {
                        legendaryItems.put(material, legendaryItems.get("motes") - 250);
                        System.out.println("Dragonwrath obtained!");
                        isObtained = true;
                        break;
                    }
                } else {
                    junkItems.putIfAbsent(material, 0);
                    junkItems.put(material, junkItems.get(material) + materialCount);
                }
            }
            if (isObtained) {
                break;
            }
            materials = scanner.nextLine().split("\\s+");
        }
        legendaryItems.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
        junkItems.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}


