package Buoi3.Bai5;

public class NhanVien implements Measurable {

    private String fullName;
    private int id;
    private int workingHour;
    private int salaryByHour;

    public NhanVien(String fullName, int id, int workingHour, int salaryByHour) {
        this.fullName = fullName;
        this.id = id;
        this.workingHour = workingHour;
        this.salaryByHour = salaryByHour;
    }

    @Override
    public float Valuate() {
        return salaryByHour * workingHour;
    }
}
