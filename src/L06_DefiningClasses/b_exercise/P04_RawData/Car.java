package L06_DefiningClasses.b_exercise.P04_RawData;

public class Car {
    Model model;
    Engine engine;
    Cargo cargo;
    Tyres tyres;

    public Car(Model model, Engine engine, Cargo cargo, Tyres tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }
}
