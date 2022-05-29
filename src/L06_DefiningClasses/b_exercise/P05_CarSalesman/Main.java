package L06_DefiningClasses.b_exercise.P05_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        for (int i = 0; i < numberOfEngines; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4) {
                engineList.add(new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]));
            } else if (tokens.length == 3) {
                try {
                    engineList.add(new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                } catch (NumberFormatException e) {
                    engineList.add(new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
                }
            } else if (tokens.length == 2) {
                engineList.add(new Engine(tokens[0], Integer.parseInt(tokens[1])));
            }
        }
        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            Engine engine = engineList.stream().filter(e-> e.model.equals(tokens[1])).findFirst().get();
            if (tokens.length == 4) {
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens[3];
                carList.add(new Car(model, engine, weight, color));
            } else if (tokens.length ==3 ) {
                try {
                    carList.add(new Car(model, engine, Integer.parseInt(tokens[2])));
                } catch (NumberFormatException e) {
                    carList.add(new Car(model, engine, tokens[2]));
                }
            } else if (tokens.length == 2) {
                carList.add(new Car(model, engine));
            }
        }
        carList.forEach(System.out::println);
    }
}
