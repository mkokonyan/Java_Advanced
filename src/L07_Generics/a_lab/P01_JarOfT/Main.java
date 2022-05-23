package L07_Generics.a_lab.P01_JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar <Integer> intJar = new Jar<>();
        intJar.add(1);
        intJar.add(2);

        Integer pickle = intJar.remove();
        System.out.println(pickle);
    }
}
