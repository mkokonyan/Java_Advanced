package L06_DefiningClasses.b_excercise.P09_CatLady;

public class Siamese extends Cat {

    double earSize;

    @Override
    public String toString() {
        return String.format("Siamese %s %.2f", this.name, this.earSize);
    }

    public Siamese(String name, double earSize) {
        this.name = name;
        this.earSize = earSize;
    }
}
