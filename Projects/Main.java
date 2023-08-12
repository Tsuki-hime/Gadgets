package Projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // char counter
        CharCounter charCounter = new CharCounter();
        System.out.println(charCounter.countMeWithSpaces(loadFile()));
        System.out.println(charCounter.countMeWithoutSpaces(loadFile()));
    }

    public static String loadFile() throws IOException {
        Path path = Paths.get("./CountMe.txt");
        return Files.readAllLines(path).get(0);
    }
}

