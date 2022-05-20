package L04_StreamsFilesAndDirectories.a_lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Java\\java-advanced-05-222\\src\\L04_StreamsFilesAndDirectories\\a_lab\\Resources\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Files.write(Paths.get("out-sorted.txt"), lines);
    }
}
