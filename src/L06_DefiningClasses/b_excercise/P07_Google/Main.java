package L06_DefiningClasses.b_excercise.P07_Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        Map<String, Person> personMap = new HashMap<>();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");

            String name = tokens[0];
            String attr = tokens[1];

            Person person =  new Person();
            person.setName(name);
            personMap.putIfAbsent(name,person);

            switch (tokens.length) {
                case 5:
                    person = personMap.get(name);
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    person.setCompany(new Company(companyName,department, salary));
                case 4:
                    person = personMap.get(name);
                    if (attr.equals("pokemon")){
                        String pokemonName = tokens[2];
                        String pokemonType = tokens[3];
                        person.setPokemons(new Pokemon(pokemonName, pokemonType));

                    } else if (attr.equals("parents")) {
                        String parentName = tokens[2];
                        String parentBirthday = tokens[3];
                        person.setParents(new Parents(parentName, parentBirthday));

                    } else if (attr.equals("children")) {
                        String childName = tokens[2];
                        String childBirthday = tokens[3];
                        person.setChildren(new Children(childName, childBirthday));
                    } else if (attr.equals("car")) {
                        String carModel = tokens[2];
                        int carSpeed = Integer.parseInt(tokens[3]);
                        person.setCar(new Car(carModel, carSpeed));
                }
                    break;
            }
            command = scanner.nextLine();
        }
        String searchedName = scanner.nextLine();
        System.out.println(personMap.get(searchedName));

    }
}
