package Buoi2.Bai3;

import java.util.Scanner;

public class Program {
    public static int Partition(Fraction[] fractions, int low, int high) {
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

    public static void QuickSort(Fraction[] fractions, int low, int high) {
        if (low < high) {
            int pi = Partition(fractions, low, high);

            QuickSort(fractions, low, pi - 1);
            QuickSort(fractions, pi + 1, high);
        }
    }

    public static Fraction Sum(Fraction[] fractions) {
        Fraction sum = new Fraction();
        sum.clone(fractions[0]);

        for (int i = 1; i < fractions.length; i++) {
            sum.clone(sum.add(fractions[i]));
        }

        return sum;
    }


    public static void Output(Fraction[] fractions) {
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i].toString() + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Nhap so luong phan so: ");
        n = input.nextInt();

        Fraction[] fractions = new Fraction[n];

        for (int i = 0; i < n; i++) {
            System.out.format("Phan so %d:\n", i + 1);

            fractions[i] = new Fraction();
            fractions[i].input();
        }

        System.out.print("Danh sach phan so: ");
        Output(fractions);
        System.out.println();

        System.out.println("Tong cac phan so: " + Sum(fractions).toString());

        QuickSort(fractions, 0, fractions.length - 1);
        System.out.print("Danh sach phan so tang dan: ");
        Output(fractions);

        input.close();
    }
}
