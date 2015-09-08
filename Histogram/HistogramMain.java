package Histogram;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HistogramMain {
    public static void main(String[] args) {
        System.out.println("Reading integers from the file: ");

        Scanner readScanner = new Scanner(System.in);
        String path = readScanner.nextLine();

        readScanner.close();

        try {
            Histogram histogramInstance = new Histogram();
            Path filePath = histogramInstance.readFile(path);
            int[] histogram = histogramInstance.readLines(filePath);

            for (int i = 0; i < histogram.length; i++) {
                if (i == histogram.length - 1) {
                    System.out.print(String.format("%s - %s \t|",
                            (i * histogramInstance.range + 1), (i) * histogramInstance.range * 2));
                } else {
                    System.out.print(String.format("%s - %s   \t|",
                            (i * histogramInstance.range + 1), (i + 1) * histogramInstance.range));
                }

                System.out.print("  ");
                for (int j = 0; j < histogram[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Something went wrong, " +
                    "please try again with a different file.");
        }
    }
}
