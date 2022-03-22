package Buoi3.Bai8;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int m;
        System.out.print("Nhap so luong sinh vien: ");
        m = inp.nextInt();

        SinhVien[] students = new SinhVien[m];
        for (int i = 0; i < m; i++) {
            inp.nextLine();

            System.out.print("Ten sinh vien: ");
            String fullName = inp.nextLine();
            System.out.print("Diem trung binh: ");
            double average = inp.nextDouble();

            students[i] = new SinhVien(fullName, average);
        }

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        inp.close();
    }
}
