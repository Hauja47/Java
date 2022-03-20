package Buoi2.Bai3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    private int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        return GCD(b, a % b);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Mau so nhap vao la 0 khong hop le. Chuyen mau so thanh 1");
            denominator = 1;
        }
        this.denominator = denominator;

        this.simplify();
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction() {}

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void clone(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public void simplify() {
        int gcd = GCD(numerator, denominator);

        setNumerator(numerator / gcd);
        setDenominator(denominator / gcd);
    }

    public Fraction add(Fraction f2) {
        return new Fraction(
            this.numerator * f2.denominator + this.denominator * f2.numerator,
            this.denominator * f2.denominator
        );
    }

    public Fraction subtract(Fraction f2) {
        return new Fraction(
            this.numerator * f2.denominator - this.denominator * f2.numerator,
            this.denominator * f2.denominator
        );
    }

    public Fraction multiple(Fraction f2) {
        return new Fraction(
            this.numerator * f2.numerator,
            this.denominator * f2.denominator
        );
    }

    public Fraction divide(Fraction f2) {
        return new Fraction(
            this.numerator * f2.denominator,
            this.denominator * f2.numerator
        );
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

    public void input() {
        Scanner inp = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Tu so: ");
                setNumerator(inp.nextInt());

                System.out.print("Mau so: ");
                do {
                    setDenominator(inp.nextInt());

                    if (getDenominator() == 0) {
                        System.out.print("Mau so khong the bang 0. Nhap mau so khac: ");
                    }
                } while (this.denominator == 0);

                this.simplify();

                break;
            } catch (InputMismatchException e) {
                System.out.println("Sai dinh dang input. Nhap lai.");
                inp.next();
                continue;
            }
        }
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
