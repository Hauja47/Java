package Buoi3.Bai1;

public class Person {
    private String fullName;
    private int age;
    private String address;

    public Person() { }

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: " + fullName + "\nTuoi: %d\nDia chi: " + address + "\n", age);
    }
}
