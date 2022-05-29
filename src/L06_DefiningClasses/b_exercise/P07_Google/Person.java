package L06_DefiningClasses.b_exercise.P07_Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;

    public Person() {
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public void setParents(Parents parent) {
        this.parents.add(parent);
    }

    public List<Children> getChildren() {
        return this.children;
    }

    public void setChildren(Children child) {
        this.children.add(child);
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("%s%n" +
                        "Company:%n" +
                        "%s" +
                        "Car:%n" +
                        "%s" +
                        "Pokemon:%n" +
                        "%s" +
                        "Parents:%n" +
                        "%s" +
                        "Children:%n" +
                        "%s",
                this.getName(),
                this.getCompany() == null ? "" : this.getCompany() + "\n",
                this.getCar() == null ? "" : this.getCar() + "\n",
                this.getPokemons().isEmpty() ? "" : this.getPokemons().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())) + "\n",
                this.getParents().isEmpty() ? "" : this.getParents().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())) + "\n",
                this.getChildren().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()))
        );
    }
}
