package L06_DefiningClasses.b_exercise.P06_PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map <String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainerMap.putIfAbsent(trainerName, new Trainer(trainerName));
            Trainer trainer = trainerMap.get(trainerName);
            trainer.pokemons.add(pokemon);

            command = scanner.nextLine();
        }
        String searchedElement = scanner.nextLine();
        while (!searchedElement.equals("End")) {
            String finalSearchedElement = searchedElement;
            trainerMap.forEach((key, value) -> {

                if (value.pokemons.stream().filter(p -> p.element.equals(finalSearchedElement)).collect(Collectors.toList()).isEmpty()) {
                    List <Pokemon> currentPokemons = trainerMap.get(key).pokemons;
                    currentPokemons.forEach(e -> e.health -= 10);

                    trainerMap.get(key).pokemons = currentPokemons.stream().filter(p -> p.health > 0).collect(Collectors.toList());
                } else {
                    trainerMap.get(key).numberOfBadges++;
                }
            });

            searchedElement = scanner.nextLine();
        }
        trainerMap.values()
                .stream()
                .sorted((t1, t2) -> {
                    if (t1.numberOfBadges > t2.numberOfBadges) {
                        return -1;
                    } else if (t1.numberOfBadges < t2.numberOfBadges){
                        return 1;
                    }
                    return 0;
                })
                .forEach(System.out::println);

    }

}
