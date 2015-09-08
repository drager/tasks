package CountDigits;

import java.util.*;

public class CountDigitsMain {
    public static void main(String[] args) {
        System.out.print("Provide a positive integer: ");

        Scanner readScanner = new Scanner(System.in);
        CountDigits myDigitInstance = new CountDigits();
        Map myDigits = myDigitInstance.countDigits(readScanner.nextLine());

        System.out.println("Zeros: " + myDigits.get("zeros"));
        System.out.println("Odd: " + myDigits.get("odd"));
        System.out.println("Even: " + myDigits.get("even"));
        System.out.println("Sum: " + myDigits.get("sum"));
    }
}
