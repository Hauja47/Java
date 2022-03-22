package Buoi3.Bai2;

public abstract class Shape {
    abstract double calculateS();

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " co dien tich: %f", calculateS());
    }
}
