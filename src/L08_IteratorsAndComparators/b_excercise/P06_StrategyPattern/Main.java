package L08_IteratorsAndComparators.b_excercise.P06_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> nameSet = new TreeSet<>(new NameComaparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());

        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();;
            String[] peopleParameters = line.split("\\s+");
            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            Person person = new Person(name, age);

            nameSet.add(person);
            ageSet.add(person);
        }

        for (Person person : nameSet) {
            System.out.println(person);
        }
        for (Person person : ageSet) {
            System.out.println(person);
        }
    }
}
