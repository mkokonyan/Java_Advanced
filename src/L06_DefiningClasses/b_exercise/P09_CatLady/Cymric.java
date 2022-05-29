package L06_DefiningClasses.b_exercise.P09_CatLady;

public class Cymric extends Cat {

    double furLength;

    @Override
    public String toString() {
        return String.format("Cymric %s %.2f", this.name, this.furLength);
    }

    public Cymric(String name, double furLength) {
        this.name = name;
        this.furLength = furLength;
    }
}
