package Buoi3.Bai4;

public class Complex {
    private double realNumber;
    private double imaginaryNumber;

    public Complex(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public Complex add(Complex c2) {
        return new Complex(realNumber + c2.realNumber, imaginaryNumber + c2.imaginaryNumber);
    }

    public Complex subtract(Complex c2) {
        return new Complex(realNumber - c2.realNumber, imaginaryNumber - c2.imaginaryNumber);
    }

    public Complex multiple(Complex c2) {
        return new Complex(
            realNumber * c2.realNumber - imaginaryNumber * c2.imaginaryNumber,
            realNumber * c2.imaginaryNumber + imaginaryNumber * c2.realNumber
        );
    }

    public Complex divide(Complex c2) {
        double realNumberResult = (realNumber * c2.realNumber + imaginaryNumber + c2.imaginaryNumber)
                                / (Math.pow(c2.realNumber, 2) + Math.pow(c2.imaginaryNumber, 2));

        double imaginaryNumberResult = (realNumber * c2.imaginaryNumber - imaginaryNumber + c2.realNumber)
                                    / (Math.pow(c2.realNumber, 2) + Math.pow(c2.imaginaryNumber, 2));

        return new Complex(realNumberResult, imaginaryNumberResult);
    }

    @Override
    public String toString() {
        String complexNumberString = String.format("%f", realNumber);

        if (imaginaryNumber == 0) {
            return complexNumberString;
        } else if (imaginaryNumber < 0) {
            return complexNumberString + " - " + String.format("%fi", -imaginaryNumber);
        }
        return complexNumberString + " + " + String.format("%fi", imaginaryNumber);
    }
}
