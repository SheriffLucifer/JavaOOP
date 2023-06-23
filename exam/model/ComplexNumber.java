package exam.model;

public class ComplexNumber {
    protected double material;
    protected double imaginary;

    public ComplexNumber(double material, double imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    public double getMaterial() {
        return material;
    }

    public double getImaginary() {
        return imaginary;
    }
}
