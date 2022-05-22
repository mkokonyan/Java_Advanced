package L06_DefiningClasses.b_excercise.P07_Google;

public class Pokemon {
    String pokemonName;
    String pokemonType;

    public Pokemon (String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString(){
        return String.format("%s %s", this.pokemonName, this.pokemonType);
    }
}
