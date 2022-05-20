package L04_StreamsFilesAndDirectories.a_lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02_WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Java\\java-advanced-05-222\\src\\L04_StreamsFilesAndDirectories\\a_lab\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        String homeDir = System.getProperty("user.home");
        FileOutputStream outputStream = new FileOutputStream(homeDir + "\\" +"out.txt");

        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        int value = inputStream.read();
        while (value != -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                outputStream.write(current);
            }

            value = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}
