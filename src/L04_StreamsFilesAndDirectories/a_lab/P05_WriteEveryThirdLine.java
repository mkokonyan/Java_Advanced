package L04_StreamsFilesAndDirectories.a_lab;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Programming\\Java\\java-advanced-05-222\\src\\L04_StreamsFilesAndDirectories\\a_lab\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("out-third-line.txt"));

        String line = reader.readLine();
        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }
        writer.flush();
    }
}
