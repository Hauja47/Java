package Buoi1.Bai6;

import java.util.Scanner;

public class Calendar {

    private static double[] moy = { 0, 13, 14, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

    public static boolean IsLeapYear(double year) {
        return (year % 4 == 0) || (year % 100 == 0 && year % 400 == 0);
    }

    public static double NumbersOfDay(double month, double year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return IsLeapYear(year) ? 29 : 28;
        }
    }

    public static double FirstDayOfMonth(int month, int year) {
        if (month == 1 || month == 2) {
            year = year + 1;
        }

        double d = ((1 + Math.floor((13 * (moy[month] + 1)) / 5) + year % 100 + Math.floor((year % 100) / 4) + Math.floor(Math.floor(year / 100) / 4) - 2 * Math.floor(year / 100)) % 7);

        // double d = ((NumbersOfDay(month, year) + ((13 * (moy[month] + 1)) / 5) + year % 100 + ((year % 100) / 4) + ((year / 100) / 4) - 2 * (year / 100)) % 7);

        if (month == 1 || month == 2) {
            d--;
        }

        return ((d + 5) % 7) + 1;
    }

    public static void PrintMonth(double month, double year) {
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");

        double n = NumbersOfDay(month, year);
        double firstDay = FirstDayOfMonth((int)month, (int)year);

        for (double i = 1; i < firstDay; i++) {
            System.out.print("   \t");
        }

        for (double i = 1; i <= n; i++) {
            System.out.print(String.format("%3.0f\t", i));

            if ((i + firstDay - 1) % 7 == 0 && i != n) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void PrintCalendar(double year) {
        for (double i = 1; i < 13; i++) {
            System.out.println("===================================================");
            System.out.println(String.format("Thang %.0f: ", i));
            System.out.println();

            PrintMonth(i, year);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nam: ");
        double year = input.nextDouble();

        PrintCalendar(year);

        input.close();
    }
}
