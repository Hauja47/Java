package Buoi3.Bai7;

import java.util.Date;

public class GiamDoc extends NhanVien {
    private int positionCoefficient;

    public GiamDoc(String fullName, Date dayOfBirth, int salaryCoeffient, String facultyName, int positionCoefficient) {
        super(fullName, dayOfBirth, salaryCoeffient, facultyName);
        this.positionCoefficient = positionCoefficient;
    }

    @Override
    public int calculateSalary() {
        return 1200000 * (this.getSalaryCoeffient() + this.positionCoefficient);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nHe so chuc vu: %d", positionCoefficient);
    }
}
