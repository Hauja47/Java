package Buoi3.Bai5;

public class SinhVien implements Measurable {
    private String fullName;
    private int iD;
    private float mathPoint;
    private float physicPoint;
    private float chemistryPoint;

    public SinhVien(String fullName, int iD, float mathPoint, float physicPoint, float chemistryPoint) {
        this.fullName = fullName;
        this.iD = iD;
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
    }

    @Override
    public float Valuate() {
        return (mathPoint + chemistryPoint + physicPoint) / 3;
    }
}
