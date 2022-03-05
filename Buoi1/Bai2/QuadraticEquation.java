import java.util.Scanner;

public class QuadraticEquation {
    private static double a;
    private static double b;
    private static double c;

    private static void Input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap tham so thu 1: ");
        a = input.nextDouble();
        System.out.println("Nhap tham so thu 2: ");
        b = input.nextDouble();
        System.out.println("Nhap tham so thu 3: ");
        c = input.nextDouble();

        input.close();
    }

    private static double CalculateDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static void Result() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else {
                double x = -c / b;
                System.out.println("x = " + x);
            }

            return;
        }

        double delta = CalculateDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + "\tx2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }

    public static void main(String[] args) {
        Input();
        Result();
    }
}
