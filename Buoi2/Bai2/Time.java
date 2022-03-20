package Buoi2.Bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {}

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void increase() {
        this.second++;

        if (this.second == 60) {
            this.second = 0;
            this.minute++;
        }

        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
        }

        if (this.hour == 25) {
            this.hour = 1;
        }
    }

    public int compare(Time t) {
        int s1 = this.second + (this.hour * 60 + this.minute) * 60;
        int s2 = t.second + (t.hour * 60 + t.minute) * 60;

        return (s1 - s2) / Math.abs(s1 - s2);
    }

    public void Input() {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                do {
                    System.out.print("Nhap gio: ");
                    this.hour = input.nextInt();

                    if (this.hour > 24 || this.hour < 1) {
                        System.out.println("Gio khong hop le. Nhap lai");
                    }
                } while (this.hour > 24 || this.hour < 1);

                do {
                    System.out.print("Nhap phut: ");
                    this.minute = input.nextInt();

                    if (this.minute > 59 || this.minute < 1) {
                        System.out.println("Phut khong hop le. Nhap lai");
                    }
                } while (this.minute > 59 || this.minute < 1);

                do {
                    System.out.print("Nhap giay: ");
                    this.second = input.nextInt();

                    if (this.second > 59 || this.second < 1) {
                        System.out.println("Giay khong hop le. Nhap lai");
                    }
                } while (this.second > 59 || this.second < 1);

                break;
            } catch (InputMismatchException e) {
                System.out.println("Sai dinh dang input. Nhap lai.");
                input.next();
                continue;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
