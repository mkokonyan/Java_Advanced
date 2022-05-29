package L06_DefiningClasses.b_exercise.P04_RawData;

public class Tyres {
    double tyre1Pressure;
    int tire1Age;
    double tyre2Pressure;
    int tire2Age;
    double tyre3Pressure;
    int tire3Age;
    double tyre4Pressure;
    int tire4Age;

    public Tyres(double tyre1Pressure, int tire1Age, double tyre2Pressure, int tire2Age, double tyre3Pressure, int tire3Age, double tyre4Pressure, int tire4Age) {
        this.tyre1Pressure = tyre1Pressure;
        this.tire1Age = tire1Age;
        this.tyre2Pressure = tyre2Pressure;
        this.tire2Age = tire2Age;
        this.tyre3Pressure = tyre3Pressure;
        this.tire3Age = tire3Age;
        this.tyre4Pressure = tyre4Pressure;
        this.tire4Age = tire4Age;
    }

    public boolean hasTyresWithPressureUnder1() {
        return tyre1Pressure < 1 || tyre2Pressure < 1 || tyre3Pressure < 1 || tyre4Pressure < 1;
    }
}
