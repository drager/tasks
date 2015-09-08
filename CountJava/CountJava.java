package CountJava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountJava {
    ArrayList<String> myCounts = new ArrayList<>();

    public List<String> openDirectory(String path) throws IOException {
        File root = new File(path);
        File[] listOfFiles = root.listFiles();

        assert listOfFiles != null;
        for (File f : listOfFiles) {
            if (f.isDirectory()) {
                openDirectory(f.getAbsolutePath());
            } else {
                if (f.getName().endsWith(".java")) {
                    myCounts.add(f.getName() + " lines = " +
                            countLines(f.getAbsoluteFile().toPath()));
                    return myCounts;
                }
            }
        }
        return myCounts;
    }

    public Integer countLines(Path path) throws IOException {
        int count;
        try (Stream<String> lines = Files.lines(
                path,
                Charset.forName("ISO-8859-1"))) {

            count = (int) lines
                    .map(String::toCharArray)
                    .count();

            return count;
        }
    }
}
