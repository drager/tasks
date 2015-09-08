package Backwards;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type a line of text: ");

        Scanner readScanner = new Scanner(System.in);
        String input = readScanner.nextLine();

        readScanner.close();
        System.out.println("Backwards: " + new StringBuffer(input).reverse().toString());
    }
}
