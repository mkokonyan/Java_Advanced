package L06_DefiningClasses.b_exercise.P05_CarSalesman;

public class Engine {
    String model;
    int power;

    int displacement;
    String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power, -1, efficiency);
    }

    public Engine(String model, int power) {
        this(model, power, -1, "n/a");
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%n",
                model,
                power,
                displacement == -1 ? "n/a" : String.valueOf(displacement),
                efficiency);
    }
}
