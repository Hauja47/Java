package Buoi1.Bai3;

import java.util.Scanner;

public class Sort {
    private static int[] numbers;

    public static int Partition(int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];;
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];;
        numbers[high] = temp;

        return i + 1;
    }

    public static void QuickSort(int low, int high) {
        if (low < high) {
            int pi = Partition(low, high);

            QuickSort(low, pi - 1);
            QuickSort(pi + 1, high);
        }
    }

    public static void Input() {
        Scanner input = new Scanner(System.in);

        System.out.print("So luong: ");
        int n = input.nextInt();
        numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("So thu " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        input.close();
    }

    public static void Result() {
        System.out.print("Mang sau sap xep: ");

        QuickSort(0, numbers.length - 1);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Input();
        Result();
    }
}
