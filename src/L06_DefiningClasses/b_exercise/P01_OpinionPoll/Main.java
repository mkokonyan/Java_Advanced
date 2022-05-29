package L06_DefiningClasses.b_exercise.P01_OpinionPoll;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Supplier<Person> createPerson = () -> {
            String[] tokens = scanner.nextLine().split("\\s+");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        };

        IntStream.range(0, n)
                .mapToObj(p -> createPerson.get())
                .filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));

    }
}
