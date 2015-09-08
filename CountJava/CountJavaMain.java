package CountJava;

import java.io.IOException;
import java.util.Scanner;

public class CountJavaMain {
    public static void main(String[] args) {
        CountJava counts = new CountJava();

        System.out.print("Root directory: ");

        Scanner readScanner = new Scanner(System.in);
        String path = readScanner.nextLine();

        try {
            counts.openDirectory(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
