package L06_DefiningClasses.b_exercise.P09_CatLady;

public class StreetExtraordinaire extends Cat {

    double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        this.name = name;
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %.2f", this.name, this.decibelsOfMeows);
    }
}
