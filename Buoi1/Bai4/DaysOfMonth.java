package Buoi1.Bai4;

import java.util.Scanner;

public class DaysOfMonth {
    public static boolean IsLeapYear(int year) {
        return (year % 4 == 0) || (year % 100 == 0 && year % 400 == 0);
    }

    public static int NumbersOfDay(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return IsLeapYear(year) ? 29 : 28;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nam: ");
        int year = input.nextInt();

        System.out.print("Thang: ");
        int month = input.nextInt();

        System.out.println("So ngay cua thang " + month + " nam " + year + " la: " + NumbersOfDay(month, year));

        input.close();
    }
}
