package Buoi1.Bai7;

public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public void clone(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Boolean greaterThan(Fraction f) {
        return this.numerator * f.denominator > this.denominator * f.numerator;
    }

    public Boolean equal(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

    public Boolean lesserThan(Fraction f) {
        return this.numerator * f.denominator < this.denominator * f.numerator;
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
