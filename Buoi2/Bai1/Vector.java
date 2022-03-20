package Buoi2.Bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector extends Point2D {
    public void Input() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap toa do vector: ");

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

        input.close();
    }
}
