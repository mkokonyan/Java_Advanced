package L06_DefiningClasses.b_excercise.P04_RawData;

import org.w3c.dom.ls.LSOutput;

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
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tyre1Pressure = Double.parseDouble(input[5]);
            int tyre1Age = Integer.parseInt(input[6]);
            double tyre2Pressure = Double.parseDouble(input[7]);
            int tyre2Age = Integer.parseInt(input[8]);
            double tyre3Pressure = Double.parseDouble(input[9]);
            int tyre3Age = Integer.parseInt(input[10]);
            double tyre4Pressure = Double.parseDouble(input[11]);
            int tyre4Age = Integer.parseInt(input[12]);

            Model carModel = new Model(model);
            Engine carEngine = new Engine(engineSpeed,enginePower);
            Cargo carCargo = new Cargo(cargoWeight,cargoType);
            Tyres carTyres = new Tyres(tyre1Pressure, tyre1Age, tyre2Pressure, tyre2Age, tyre3Pressure, tyre3Age, tyre4Pressure,tyre4Age);
            cars.add(new Car(carModel, carEngine, carCargo, carTyres));

        };


        int numbersOfCars = Integer.parseInt(scanner.nextLine());
        IntStream.range(0, numbersOfCars).forEach(ignored -> addCar.accept(scanner.nextLine().split("\\s+")));
        
        String cargoType = scanner.nextLine();
        if (cargoType.equals("fragile")) {
            cars.stream().filter(c -> c.cargo.cargoType.equals("fragile")).filter(c -> c.tyres.hasTyresWithPressureUnder1()).forEach(c -> System.out.println(c.model.model));
        } else if (cargoType.equals("flamable")) {
            cars.stream().filter(c -> c.cargo.cargoType.equals("flamable")).filter(c -> c.engine.hasTyresEngineAbove250()).forEach(c -> System.out.println(c.model.model));
        }
    }
}
