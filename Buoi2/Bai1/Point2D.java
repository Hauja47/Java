package Buoi2.Bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    };

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void SetX(double x) {
        this.x = x;
    }

    public void SetY(double y) {
        this.y = y;
    }

    public double GetX() {
        return this.x;
    }

    public double GetY() {
        return this.y;
    }

    public void Input() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap toa do diem: ");

            try {
                System.out.print("x: ");
                SetX(input.nextDouble());
                System.out.print("y: ");
                SetY(input.nextDouble());

                break;
            } catch (InputMismatchException e) {
                System.out.println("Sai dinh dang input. Nhap lai.");
                input.next();
                continue;
            }
        }

        // input.close();
    }

    public String ToString() {
        return String.format("(%.2f, %.2f)\n", this.x, this.y);
    }

    public double Distance(Point2D point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    public void Move(Vector vector) {
        SetX(GetX() + vector.GetX());
        SetY(GetY() + vector.GetY());
    }
}
