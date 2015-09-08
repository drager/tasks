package Diamond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Provide an odd integer: ");

        Scanner readScanner = new Scanner(System.in);
        try {
            Integer n = Integer.parseInt(readScanner.nextLine());
            if (n % 2 == 0) {
                System.out.print("That wasn't a odd number...");
                System.exit(1);
            }
            System.out.println(drawDiamond(n));
        } catch (Exception e) {
            System.out.print("That wasn't a odd number...");
        }
    }

    public static String drawDiamond(Integer thickness) {
        String asterisk = "*";
        String myString = "";

        for (int i = 0; i < thickness; i++) {
            if (i % 2 == 0) {
                myString += asterisk;
            }
            else {
                myString += "\n";
            }

            for (int x = 0; x < i; x++) {
                if (i % 2 == 0) {
                    myString += asterisk;
                }
            }
            if (i % 2 == 0 && i == thickness - 1) {
                List<String> myStrings = new ArrayList<>();
                String old = myString;
                Collections.addAll(myStrings, old.split("\n"));

                myStrings.remove(myStrings.size() - 1);

                old = String.join("\n", myStrings);
                old += "\n";
                myString += new StringBuffer(old).reverse().toString();
            }
        }
        return myString;
    }
}
