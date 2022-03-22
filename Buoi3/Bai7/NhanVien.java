package Buoi3.Bai7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private String fullName;
    private Date dayOfBirth;
    private int salaryCoeffient;
    private String facultyName;

    public NhanVien() {
    }

    public NhanVien(String fullName, Date dayOfBirth, int salaryCoeffient, String facultyName) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.salaryCoeffient = salaryCoeffient;
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getSalaryCoeffient() {
        return salaryCoeffient;
    }

    public void setSalaryCoeffient(int salaryCoeffient) {
        this.salaryCoeffient = salaryCoeffient;
    }

    public int calculateSalary() {
        return 1200000 * salaryCoeffient;
    }

    @Override
    public int compareTo(NhanVien o) {
        if (this.calculateSalary() == o.calculateSalary()) {
            return 0;
        }

        return (this.calculateSalary() - o.calculateSalary()) / Math.abs(this.calculateSalary() - o.calculateSalary());
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat =  new SimpleDateFormat("dd-MM-yyyy");
        return String.format("Ho ten: " + fullName + "\nNgay sinh: " + (dateFormat.format(dayOfBirth)) + "\nHe so luong: %d\nTen don vi: " + facultyName , salaryCoeffient);
    }
}
