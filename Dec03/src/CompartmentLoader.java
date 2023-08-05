import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CompartmentLoader {
    public static List<String> loadCompartments() {
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get("resources/Dec03Input.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allLines;
    }

}
