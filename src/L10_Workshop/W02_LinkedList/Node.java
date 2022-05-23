package L10_Workshop.W02_LinkedList;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}
