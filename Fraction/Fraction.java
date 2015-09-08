package Fraction;

public class Fraction {
    final int n, d;

    public Fraction(int n, int d) {
        int gcd = calculateGCD(n, d);
        this.n = n / gcd;
        this.d = d / gcd;
    }

    public Integer getNumerator() {
        return this.n;
    }

    public Integer getDenominator() {
        return this.d;
    }

    public Boolean isNegative() {
        return this.n < 0 != this.d < 0;
    }

    public Fraction add(Fraction fractionToAdd) {
        return new Fraction(n * fractionToAdd.getDenominator()
                + fractionToAdd.getNumerator() * d,
                d * fractionToAdd.getDenominator());
    }

    public Fraction subtract(Fraction fractionToSubtract) {
        return new Fraction(n * fractionToSubtract.getDenominator()
                - fractionToSubtract.getNumerator() * d,
                d * fractionToSubtract.getDenominator());
    }

    public Fraction multiply(Fraction fractionToMultiply) {
        return new Fraction(n * fractionToMultiply.getNumerator(),
                d * fractionToMultiply.getDenominator());
    }

    public Fraction divide(Fraction fractionToDivide) {
        return new Fraction(n * fractionToDivide.getDenominator(),
                d * fractionToDivide.getNumerator());
    }

    public Boolean isEqualTo(Fraction other) {
        int gcd = calculateGCD(this.n, this.d);
        int n = this.n / gcd;
        int d = this.d / gcd;

        int otherGcd = calculateGCD(other.getNumerator(),
                other.getDenominator());
        int otherN = other.getNumerator() / otherGcd;
        int otherD = other.getDenominator() / otherGcd;

        return n == otherN && d == otherD;
    }

    public String toString() {
        return String.format("%d/%d", n, d);
    }

    private Integer calculateGCD(Integer a, Integer b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

}
