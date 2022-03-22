package Buoi3.Bai8;

public class SinhVien implements Comparable<SinhVien> {

    private String fullName;
    private double average;


    public SinhVien(String fullName, double average) {
        this.fullName = fullName;
        this.average = average;
    }

    @Override
    public int compareTo(SinhVien sv) {
        if (this.average == sv.average) {
            return 0;
        }
        else if (this.average > sv.average) {
            return 1;
        }

        return -1;
    }

    @Override
    public String toString() {
        return String.format(fullName + "_%f", average);
    }
}
