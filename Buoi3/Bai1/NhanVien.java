package Buoi3.Bai1;

public class NhanVien extends Person {
    private int luongCoBan;
    private int heSo;

    public NhanVien(String fullName, int age, String address, int luongCoBan, int heSo) {
        super(fullName, age, address);

        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
    }

    public int tinhLuong() {
        return this.luongCoBan * this.heSo;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Luong co ban: %d\nHe so: %d\n", luongCoBan, heSo);
    }
}
