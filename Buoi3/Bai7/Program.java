package Buoi3.Bai7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static Scanner inp;

    public static void input(NhanVien[] employees) throws ParseException {
        int n;
        System.out.print("Nhap so luong: ");
        n = inp.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        int choice;
        for (int i = 0; i < n; i++) {
            System.out.println("Chon chuc vu: \n\t1. Nhan vien\n2.Quan ly\n3. Giam doc");
            choice = inp.nextInt();

            if (choice < 1 || choice > 3) {
                i--;
                break;
            }

            inp.nextLine();
            System.out.print("Ten nhan vien: ");
            String fullName = inp.nextLine();

            System.out.print("Ngay sinh (dd-MM-yyyy): ");
            Date dayOfBirth = dateFormat.parse(inp.nextLine());

            System.out.print("He so luong: ");
            int salaryCoeffient = inp.nextInt();

            inp.nextLine();
            System.out.print("Ten don vi: ");
            String facultyName = inp.nextLine();

            switch (choice) {
                case 1:
                    employees[i] = new NhanVien(fullName, dayOfBirth, salaryCoeffient, facultyName);
                    break;
                case 2:
                    employees[i] = new QuanLy(fullName, dayOfBirth, salaryCoeffient, facultyName, 0);
                    break;
                case 3:
                    System.out.print("He so chuc vu: ");
                    int positionCoefficient = inp.nextInt();

                    employees[i] = new GiamDoc(fullName, dayOfBirth, salaryCoeffient, facultyName, positionCoefficient);
                    break;
                default:
                    i--;
                    break;
            }
        }
    }

    public static void output(NhanVien[] employees) {
        int n = employees.length;
        System.out.println("Danh sach nhan vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static void maxSalary(NhanVien[] employees) {
        Arrays.sort(employees);

        System.out.println("Nhan vien co luong cao nhat: ");
        System.out.println(employees[employees.length - 1].toString());
    }

    public static void bearInFerbuary(NhanVien[] employees) {
        System.out.println("Nhan vien sinh trong thang 2: ");
        LocalDate localDate;

        for (int i = 0; i < employees.length; i++) {
            localDate = employees[i].getDayOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (localDate.getMonth() == Month.FEBRUARY) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        inp = new Scanner(System.in);
    }
}
