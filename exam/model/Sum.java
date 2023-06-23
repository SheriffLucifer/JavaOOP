package exam.model;

public class Sum extends Calc {
    @Override
    public ComplexNumber result() {
        double newMaterial = material1 + material2;
        double newImaginary = imaginary1 + imaginary2;
        ComplexNumber res = new ComplexNumber(newMaterial, newImaginary);
        return res;
    }

    @Override
    public void setComplexNumber1(ComplexNumber number) {
        material1 = number.material;
        imaginary1 = number.imaginary;
    }

    @Override
    public void setComplexNumber2(ComplexNumber number) {
        material2 = number.material;
        imaginary2 = number.imaginary;
    }
}
