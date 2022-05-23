package L07_Generics.a_lab.P01_JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    private Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();

    }

    public void add(T element) {
        this.elements.push(element);
    }
    public T remove() {
        return this.elements.pop();
    }
}
