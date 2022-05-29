package L06_DefiningClasses.b_exercise.P04_RawData;

public class Engine {
    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public boolean hasTyresEngineAbove250() {
        return enginePower > 250;
    }
}
