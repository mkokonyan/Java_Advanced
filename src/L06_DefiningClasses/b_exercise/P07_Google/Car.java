package L06_DefiningClasses.b_exercise.P07_Google;

public class Car {
    String carModel;
    int carSpeed;

    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.carModel, this.carSpeed);
    }
}
