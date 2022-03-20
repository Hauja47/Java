package Buoi2.Bai2;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Time t1 = new Time();

        System.out.println("Nhap thoi gian thu 1: ");
        t1.Input();

        Time t2 = new Time();

        System.out.println("Nhap thoi gian thu 2: ");
        t2.Input();

        System.out.print("Thoi gian lon hon: ");
        if (t1.compare(t2) == 1) {
            System.out.println(t1.toString());
        } else {
            System.out.println(t2.toString());
        }

        while (true) {
            Thread.sleep(1000);
            t1.increase();
            System.out.println(t1.toString());
        }
    }
}
