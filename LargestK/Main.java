package LargestK;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Provide a positive integer: ");

        Scanner readScanner = new Scanner(System.in);
        Integer n = Integer.parseInt(readScanner.nextLine());

        System.out.println("N=" + n + " => " + "K=" + calculateK(n));
    }

    public static Integer calculateK(Integer inputNumber) {
        int k = 0;
        int value = 0;
        int sum = 0;

        for (int i = 0; i < inputNumber; i++) {
            value += 2;
            sum = value + sum;

            if (sum <= inputNumber) {
                k = value;
            }
        }

        return k;
    }
}
