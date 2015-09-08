package Fraction;

public class FractionMain {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction(5, 5);

        System.out.println(myFraction.isNegative());
        System.out.println(myFraction.add(new Fraction(10, 5)));
        System.out.println(myFraction.subtract(new Fraction(10, 5)));
        System.out.println(myFraction.multiply(new Fraction(10, 5)));
        System.out.println(myFraction.divide(new Fraction(10, 5)));

        System.out.println(myFraction.isEqualTo(new Fraction(10, 10)));
    }
}
