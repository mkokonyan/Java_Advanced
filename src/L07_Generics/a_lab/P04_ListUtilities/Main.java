package L07_Generics.a_lab.P04_ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(13, 42, 73, 69);
        List<String > strings = List.of("13", "42", "73", "69");

        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMin(strings));
    }
}
