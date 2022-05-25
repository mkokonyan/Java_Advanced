package L08_IteratorsAndComparators.b_excercise.P05_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {
            String[] peopleParameteres = input.split("\\s+");
            String name = peopleParameteres[0];
            int age = Integer.parseInt(peopleParameteres[1]);
            String town = peopleParameteres[2];
            Person person = new Person(name, age, town);

            people.add(person);
            input = scanner.nextLine();
        }

        int comparePerson = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(comparePerson - 1);
        people.remove(comparePerson - 1);

        int totalPeople = people.size() + 1;
        int samePeople = 0;
        int differentPeople = 0;

        for (Person person : people) {
            if (person.compareTo(personToCompare)==0) {
                samePeople++;
            } else {
                differentPeople++;
            }
            if (samePeople == 0) {
                System.out.println("No matches");
            } else {
                System.out.printf("%d %d %d", ++samePeople, differentPeople, totalPeople);
            }
        }
    }
}
