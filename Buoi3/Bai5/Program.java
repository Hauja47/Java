package Buoi3.Bai5;

import java.util.Scanner;

public class Program {

    public static float Average(Measurable[] list, int n) {
        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += list[i].Valuate();
        }

        return sum / n;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Nhap so luong nhan vien: ");
        n = inp.nextInt();

        NhanVien[] employees = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            inp.nextLine();

            System.out.print("Ten nhan vien: ");
            String fullName = inp.nextLine();
            System.out.print("Id: ");
            int id = inp.nextInt();
            System.out.print("So gio lam: ");
            int workingHour = inp.nextInt();
            System.out.print("Gia theo gio: ");
            int salaryByHour = inp.nextInt();

            employees[i] = new NhanVien(fullName, id, workingHour, salaryByHour);
        }

        int m;
        System.out.print("Nhap so luong sinh vien: ");
        m = inp.nextInt();

        SinhVien[] students = new SinhVien[m];
        for (int i = 0; i < m; i++) {
            inp.nextLine();

            System.out.print("Ten sinh vien: ");
            String fullName = inp.nextLine();
            System.out.print("Id: ");
            int id = inp.nextInt();
            System.out.print("Diem Toan: ");
            float mathPoint = inp.nextFloat();
            System.out.print("Diem Ly: ");
            float physicPoint = inp.nextFloat();
            System.out.print("Diem Hoa: ");
            float chemistryPoint = inp.nextFloat();

            students[i] = new SinhVien(fullName, id, mathPoint, physicPoint, chemistryPoint);
        }

        System.out.println("Luong trung binh cua nhan vien: " + Average(employees, n));
        System.out.println("Diem trung binh cua sinh vien: " + Average(students, m));

        inp.close();
    }
}
