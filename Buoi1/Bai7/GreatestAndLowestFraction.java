package Buoi1.Bai7;

import java.util.Scanner;

public class GreatestAndLowestFraction {
    private static Fraction[] fractions;

    public static int Partition(int low, int high) {
        Fraction pivot = fractions[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (fractions[j].lesserThan(pivot)) {
                i++;

                Fraction temp = new Fraction(fractions[i]);
                fractions[i].clone(fractions[j]);
                fractions[j].clone(temp);
            }
        }

        Fraction temp = new Fraction(fractions[i + 1]);
        fractions[i + 1].clone(fractions[high]);
        fractions[high].clone(temp);

        return i + 1;
    }

    public static void QuickSort(int low, int high) {
        if (low < high) {
            int pi = Partition(low, high);

            QuickSort(low, pi - 1);
            QuickSort(pi + 1, high);
        }
    }

    public static void Result() {
        QuickSort(0, fractions.length - 1);

        System.out.println("Phan so nho nhat: " + fractions[0].toString());
        System.out.println("Phan so lon nhat: " + fractions[fractions.length - 1].toString());
    }

    public static void Input() {
        Scanner input = new Scanner(System.in);

        System.out.print("So luong: ");
        int n = input.nextInt();
        fractions = new Fraction[n];

        int numerator;
        int denominator;

        for (int i = 0; i < fractions.length; i++) {
            System.out.println("Phan so thu " + (i + 1) + ": ");

            System.out.print("Tu so: ");
            numerator = input.nextInt();
            System.out.print("Mau so: ");
            denominator = input.nextInt();

            fractions[i] = new Fraction(numerator, denominator);
        }

        input.close();
    }

    public static void main(String[] args) {
        Input();
        Result();
    }
}
