package Buoi3.Bai7;

import java.util.Date;

public class QuanLy extends NhanVien{
    private int employeesNumber;

    public QuanLy(String fullName, Date dayOfBirth, int salaryCoeffient, String facultyName, int employeesNumber) {
        super(fullName, dayOfBirth, salaryCoeffient, facultyName);
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo nhan vien quan ly: %d" + employeesNumber;
    }
}
