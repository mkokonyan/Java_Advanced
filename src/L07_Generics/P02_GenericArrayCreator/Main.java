package L07_Generics.P02_GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Object[] integer = ArrayCreator.create(10, 13);

        String[] strings = ArrayCreator
                .<String>create(String.class, 3, "Java");


        for (String string: strings) {
            System.out.println(string);

            System.out.println(string);
        }
        System.out.println();
    }
}
