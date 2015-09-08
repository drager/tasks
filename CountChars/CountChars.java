package CountChars;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CountChars {
    int uppercaseLetters;
    int lowercaseLetters;
    int whitespaces;
    int specialCharacters;
    int digits;

    public Path readFile(String path, String name) {
        return Paths.get(path, name);
    }

    public Map<String, Integer> readLines(Path path) throws IOException {
        Map<String, Integer> countMap = new HashMap<>();

        try (Stream<String> lines = Files.lines(
                path,
                Charset.forName("ISO-8859-1"))) {

            lines
                    .map(String::toCharArray)
                    .forEach(character -> {
                        for (char aCharacter : character) {
                            if (Character.isUpperCase(aCharacter)) {
                                uppercaseLetters += 1;
                            }

                            if (Character.isLetter(aCharacter) &&
                                    Character.isLowerCase(aCharacter)) {
                                lowercaseLetters += 1;
                            }

                            if (Character.isWhitespace(aCharacter)) {
                                whitespaces += 1;
                            }

                            if (!Character.isLetterOrDigit(aCharacter) &&
                                    !Character.isWhitespace(aCharacter)) {
                                specialCharacters += 1;
                            }

                            if (Character.isDigit(aCharacter)) {
                                digits += 1;
                            }
                        }
                    });

            countMap.put("uppercase", uppercaseLetters);
            countMap.put("lowercase", lowercaseLetters);
            countMap.put("whitespaces", whitespaces);
            countMap.put("special", specialCharacters);
            countMap.put("digits", digits);

            return countMap;
        }
    }
}
