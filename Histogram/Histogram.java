package Histogram;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Histogram {
    final int maxValue = 11;
    final int range = 10;

    public Path readFile(String path) {
        return Paths.get(path);
    }

    public int[] readLines(Path path) throws IOException {

        int[] histogram = new int[maxValue];

        for (int i = 0; i < histogram.length; i++) {
            histogram[i] = 0;
        }

        try (Stream<String> lines = Files.lines(path, Charset.forName("ISO-8859-1"))) {
            lines.forEach(character -> {
                int number = Integer.parseInt(character.trim());
                if (number >= range * range + 1) {
                    histogram[histogram.length - 1] += 1;
                } else {
                    histogram[(number - 1) / range] += 1;
                }
            });
        }
        return histogram;
    }
}
