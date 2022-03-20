package Buoi2.Bai1;

public class Program {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();

        System.out.println("Diem thu nhat: ");
        p1.Input();

        Point2D p2 = new Point2D();

        System.out.println("Diem thu hai: ");
        p2.Input();

        Vector vector = new Vector();

        System.out.println("Vector: ");
        vector.Input();

        p1.Move(vector);
        p2.Move(vector);

        System.out.println("Diem thu nhat sau khi di chuyen: " + p1.ToString());
        System.out.println("Diem thu hai sau khi di chuyen: " + p2.ToString());
        System.out.println("Khoang cach giua 2 diem: " + p1.Distance(p2));
    }
}
