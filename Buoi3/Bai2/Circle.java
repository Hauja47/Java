package Buoi3.Bai2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateS() {
        return Math.PI * Math.pow(radius, 2);
    }
}
