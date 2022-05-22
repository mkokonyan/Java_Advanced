package L06_DefiningClasses.b_excercise.P09_CatLady;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Cat> cats = new ArrayList<>();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            double attr = Double.parseDouble(tokens[2]);

            switch (type) {
                case "Siamese":
                    cats.add(new Siamese(name, attr));
                    break;
                case "Cymric":
                    cats.add(new Cymric(name, attr));
                    break;
                case "StreetExtraordinaire":
                    cats.add(new StreetExtraordinaire(name, attr));
                    break;
            }

            command = scanner.nextLine();

        }
        String catName = scanner.nextLine();
        System.out.println(cats
                .stream()
                .filter(c -> c.name.equals(catName))
                .collect(Collectors.toList())
                .get(0));
    }
}
