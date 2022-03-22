package Buoi3.Bai4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double realNumber;
        double imaginaryNumber;

        System.out.println("Nhap so phuc thu nhat: ");
        System.out.print("So thuc: ");
        realNumber = input.nextDouble();
        System.out.print("So ao: ");
        imaginaryNumber = input.nextDouble();

        Complex c1 = new Complex(realNumber, imaginaryNumber);

        System.out.println("Nhap so phuc thu hai: ");
        System.out.print("So thuc: ");
        realNumber = input.nextDouble();
        System.out.print("So ao: ");
        imaginaryNumber = input.nextDouble();

        Complex c2 = new Complex(realNumber, imaginaryNumber);

        System.out.println("Tong hai so phuc: " + c1.add(c2).toString());
        System.out.println("Hieu hai so phuc: " + c1.subtract(c2).toString());
        System.out.println("Tich hai so phuc: " + c1.multiple(c2).toString());
        System.out.println("Thuong hai so phuc: " + c1.divide(c2).toString());
    }
}
