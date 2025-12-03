package utls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class IOUtil {

    public static List<String> readFile(String path) {
        try (Stream<String> lineStream = Files.lines(Path.of(path))) {
            return lineStream.toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
