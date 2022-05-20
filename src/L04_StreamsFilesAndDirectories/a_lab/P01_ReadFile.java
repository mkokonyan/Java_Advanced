package L04_StreamsFilesAndDirectories.a_lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming\\Java\\java-advanced-05-222\\src\\L04_StreamsFilesAndDirectories\\a_lab\\Resources\\input.txt";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            int value = inputStream.read();
            while (value != -1) {
                System.out.print(Integer.toBinaryString(value) + " ");
                value = inputStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
