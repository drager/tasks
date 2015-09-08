package CountChars;

import java.nio.file.Path;
import java.util.Map;

public class CountCharsMain {
    public static void main(String[] args) {
        try {
            CountChars myDigits = new CountChars();
            Path path = myDigits.readFile(
                    "/tmp/",
                    "SergioGarciaBeatsTheAmericans.txt");
            Map myChars = myDigits.readLines(path);

            System.out.println("Uppercase: " + myChars.get("uppercase"));
            System.out.println("Lowercase: " + myChars.get("lowercase"));
            System.out.println("Whitespaces: " + myChars.get("whitespaces"));
            System.out.println("Specials: " + myChars.get("special"));
            System.out.println("Numbers: " + myChars.get("digits"));
        } catch (Exception ignored) {
        }
    }
}
