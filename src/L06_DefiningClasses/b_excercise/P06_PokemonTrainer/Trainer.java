package L06_DefiningClasses.b_excercise.P06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    String name;
    public int numberOfBadges;
    List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, numberOfBadges, this.pokemons.size());
    }
}


