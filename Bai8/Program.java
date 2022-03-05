import java.util.Scanner;

public class Program {
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

    public static int CountEven() {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static double Average() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += (double)numbers[i];
        }

        return sum / numbers.length;
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
        int evenNums = CountEven();
        System.out.println("So phan tu chan: " + evenNums);
        System.out.println("So phan tu le: " + (numbers.length - evenNums));

        System.out.println("Gia tri trung binh: " + Average());

        int[] temp = numbers.clone();

        QuickSort(0, numbers.length - 1);

        System.out.println("Phan tu lon nhat: " + numbers[numbers.length - 1]);
        System.out.println("Phan tu nho nhat: " + numbers[0]);

        System.out.print("Mang theo chieu nguoc lai: ");
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }

        System.out.println();
        System.out.println("Mang sau sap xep theo tang dan: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Input();
        Result();
    }
}
