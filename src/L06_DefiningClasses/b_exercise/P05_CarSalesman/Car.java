package L06_DefiningClasses.b_exercise.P05_CarSalesman;

public class Car {
    String model;
    Engine engine;

    int weight;
    String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, -1, color);
    }

    public Car(String model, Engine engine) {
        this(model, engine, -1, "n/a");
    }

    @Override
    public String toString() {
        return String.format("%s:%n%sWeight: %s%nColor: %s",
                model,
                engine,
                weight == - 1 ? "n/a" : String.valueOf(weight),
                color
                );
    }
}
