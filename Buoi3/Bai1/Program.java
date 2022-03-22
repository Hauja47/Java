package Buoi3.Bai1;

import java.util.Scanner;

public class Program {

    public static NhanVien maxSalaryEmployee(NhanVien[] employees, int n) {
        int index = 0;
        int max = employees[0].tinhLuong();

        for (int i = 1; i < n; i++) {
            int salary = employees[i].tinhLuong();
            if (salary > max) {
                max = salary;
                index = i;
            }
        }

        return employees[index];
    }

    public static int tinhTongLuong(NhanVien[] employees, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += employees[i].tinhLuong();
        }

        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        n = scanner.nextInt();

        NhanVien[] employees = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.println("Nhan vien " + (i + 1) +":");

            System.out.print("Ten nhan vien: ");
            String fullName = scanner.nextLine();

            System.out.print("Tuoi: ");
            int age = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Dia chi: ");
            String address = scanner.nextLine();

            System.out.print("Luong co ban: ");
            int luongCoBan = scanner.nextInt();

            System.out.print("He so: ");
            int heSo = scanner.nextInt();

            employees[i] = new NhanVien(fullName, age, address, luongCoBan, heSo);
        }

        System.out.println("Tong luong: " + tinhTongLuong(employees, n));

        NhanVien temp = maxSalaryEmployee(employees, n);
        System.out.println("Nhan vien co luong cao nhat: ");
        System.out.print(temp.toString());

        scanner.close();
    }
}
