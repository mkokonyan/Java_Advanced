package L06_DefiningClasses.b_excercise.P03_SpeedRacing;

public class Car {
    String model;
    double fuelAmount;
    double fuelCostFor1km;
    int distanceTraveled;

    public Car(String model, int fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distanceTraveled = 0;
    }

    public void drive(int amountOfKm) {
        if (fuelAmount >= amountOfKm * fuelCostFor1km) {
            distanceTraveled += amountOfKm;
            fuelAmount -= fuelCostFor1km * amountOfKm;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTraveled);
    }
}
