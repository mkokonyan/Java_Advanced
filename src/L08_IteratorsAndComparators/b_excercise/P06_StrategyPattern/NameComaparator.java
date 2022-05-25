package L08_IteratorsAndComparators.b_excercise.P06_StrategyPattern;

import java.util.Comparator;

public class NameComaparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(), o2.getName().length());

        if (result == 0) {
            result = Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));
        }
        return  result;
    }
}

