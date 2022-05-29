package L08_IteratorsAndComparators.b_exercise.P01_ListyIterator;

import java.util.Arrays;
import java.util.List;

public class ListyIterator {
    List<String> elements;
    private int currentIndex = 0;


    public ListyIterator(String... elements) {
        this.elements = Arrays.asList(elements);
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return  true;
        }
        return false;
    }

    public void print() {
        if (this.elements.size() == 0) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(currentIndex));
    }

}
