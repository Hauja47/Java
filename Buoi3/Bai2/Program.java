package Buoi3.Bai2;

import java.util.Scanner;

public class Program {
    static int rectNum = 0;
    static int circNum = 0;
    static int indexMaxS = 0;

    public static void Input(Shape[] shapes, int n) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Hinh " + i + ": ");

            System.out.println("Chon hinh: ");
            System.out.println("1. Hinh chu nhat\n2. Hinh tron\n");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Chieu dai: ");
                    double width = scanner.nextDouble();

                    System.out.print("Chieu rong: ");
                    double height = scanner.nextDouble();

                    shapes[i] = new Rectangle(height, width);
                    rectNum++;
                    break;
                case 2:
                    System.out.print("Ban kinh: ");
                    double radius = scanner.nextDouble();

                    shapes[i] = new Circle(radius);
                    circNum++;
                    break;
                default:
                    i--;
                    break;
            }

            if (max < shapes[i].calculateS()) {
                max = shapes[i].calculateS();
                indexMaxS = i;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        n = scanner.nextInt();

        Shape[] shapes = new Shape[n];

        Input(shapes, n);

        System.out.println("So luong hinh chu nhat: " + rectNum);
        System.out.println("So luong hinh tron: " + circNum);

        System.out.println("Hinh co dien tich lon nhat: " + shapes[indexMaxS].toString());

        scanner.close();
    }
}
