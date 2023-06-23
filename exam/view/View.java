package homework7.view;

import java.util.Scanner;

import homework7.model.ComplexNumber;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(ComplexNumber number, String str) {
        if (number.getImaginary() >= 0) {
            System.out.println("\n" + str + number.getMaterial() + " + " + number.getImaginary() + "i");
        } else {
            System.out.println("\n" + str + number.getMaterial() + " - " + Math.abs(number.getImaginary()) + "i");
        }

    }

}
