package Buoi1.Bai5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Program {
    public static void funcAdd(Vector<Integer> vtrIntegers) {
        int index = 0;
        int value = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap vi tri phan tu muon them: ");
        index = scn.nextInt();

        if (index < 0 || index > vtrIntegers.size() + 1) {
            System.out.println("Vi tri khong ton tai");
        } else {
            System.out.print("Nhap gia tri: ");
            value = scn.nextInt();

            if (index == vtrIntegers.size() + 1) {
                vtrIntegers.add(value);
            } else {
                vtrIntegers.add(index, value);
            }
        }
    }

    public static void funcRemove(Vector<Integer> vtrIntegers) {
        int index = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap vi tri phan tu muon xoa: ");
        index = scn.nextInt();

        if (index < 0 || index > vtrIntegers.size() - 1) {
            System.out.println("Vi tri khong ton tai");
        } else {
            vtrIntegers.remove(index);
        }
    }

    public static void funcUpdate(Vector<Integer> vtrIntegers) {
        int index = 0;
        int value = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap gia tri phan tu muon sua: ");
        index = scn.nextInt();

        if (index < 0 || index > vtrIntegers.size()) {
            System.out.println("Vi tri khong ton tai");
        } else {
            System.out.print("Nhap gia tri: ");
            value = scn.nextInt();
            vtrIntegers.set(index, value);
        }

        scn.close();
    }

    public static void funcSort(Vector<Integer> vtrIntegers) {
        Collections.sort(vtrIntegers);
    }

    public static float funcAverage(Vector<Integer> vtrIntegers) {
        float sum = 0;
        for (int i = 0; i < vtrIntegers.size(); i++) {
            sum += vtrIntegers.get(i);
        }

        return (float) (sum / vtrIntegers.size());
    }

    public static void funcNumNearAvrg(Vector<Integer> vtrIntegers) {
        float average = funcAverage(vtrIntegers);

        int NumNear = vtrIntegers.get(0);
        float min = Math.abs((float) (vtrIntegers.get(0) - average));
        for (int i = 1; i < vtrIntegers.size(); i++) {
            float check = Math.abs((float) (vtrIntegers.get(i) - average));
            if (check < min) {
                min = check;
                NumNear = vtrIntegers.get(i);

            }
        }
        System.out.println("So gan gia tri trung binh nhat la: "+ NumNear);
    }

    public static void main(String[] args) {
        Vector<Integer> ListInt = new Vector<>();
        int n = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("So luong: ");
        n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("So thu " + (i + 1) + ": ");
            ListInt.add(inp.nextInt());
        }

        int choose = -1;

        do {
            System.out.print("Day so hien tai: ");
            for (int i = 0; i < ListInt.size(); i++) {
                System.out.print(ListInt.get(i) + " ");
            }
            System.out.println();
            System.out.println("\nNhap lua chon: ");
            System.out.println("0: Thoat ");
            System.out.println("1: Them ");
            System.out.println("2: Xoa ");
            System.out.println("3: Sua ");
            System.out.println("4: Sap xep tang dan");
            System.out.println("5: Tinh gia tri trung binh ");
            System.out.println("6: Phan tu gan gia tri trung binh ");
            choose = inp.nextInt();

            switch (choose) {
                case 0:
                    break;
                case 1:
                    funcAdd(ListInt);
                    break;
                case 2:
                    funcRemove(ListInt);
                    break;
                case 3:
                    funcUpdate(ListInt);
                    break;
                case 4:
                    funcSort(ListInt);
                    break;
                case 5:
                    System.out.println("Giá trị trung bình: ");
                    System.out.format("%.2f", funcAverage(ListInt));
                    System.out.println();
                    break;
                case 6:
                    funcNumNearAvrg(ListInt);
                    break;
                default:
                    break;
            }
        } while (choose != 0);

        inp.close();
    }
}
