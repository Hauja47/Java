package Buoi3.Bai6;

import org.junit.Test;

import junit.framework.*;

public class MyMath {
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }

        return greatestCommonDivisor(b % a, a);
    }

    public static double minOfThree(double a, double b, double c) {
        double min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        return c;
    }

    public static double maxOfThree(double a, double b, double c) {
        double max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        return c;
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        else if (a == 2) {
            return true;
        }
        else if (a % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumToN(int n) {
        return ((1 + n) * n) / 2;
    }

    public static int absolute(int n) {
        return (n < 0) ? -n : n;
    }

    public static int ceil(double n) {
        return (int)n;
    }
}
