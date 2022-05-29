package L06_DefiningClasses.b_exercise.P03_SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        Consumer<String[]> addCar = input -> {
            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCostFor1km = Double.parseDouble(input[2]);
            cars.add(new Car(model, fuelAmount, fuelCostFor1km));
        };

        int numbersOfCars = Integer.parseInt(scanner.nextLine());
        IntStream.range(0, numbersOfCars).forEach(ignored -> addCar.accept(scanner.nextLine().split("\\s+")));

        String data = scanner.nextLine();
        while (!data.equals("End")) {

            String model = data.split("\\s+")[1];
            int amountOfKm = Integer.parseInt(data.split("\\s+")[2]);
            Car currentCar = cars.stream()
                    .filter(c -> c.model.equals(model))
                    .findFirst().get();
            currentCar.drive(amountOfKm);
            data = scanner.nextLine();
        }
        cars.forEach(c -> System.out.println(c.toString()));
    }
}
