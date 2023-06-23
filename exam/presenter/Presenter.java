package homework7.presenter;

import homework7.model.ComplexNumber;
import homework7.model.Model;
import homework7.view.View;

public class Presenter {

    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void runCalc() {
        double material1 = view.getValue("Введите вещественную часть первого комплексного числа: ");
        double imaginary1 = view.getValue("Введите мнимую часть первого комплексного числа: ");
        double material2 = view.getValue("Введите вещественную часть второго комплексного числа: ");
        double imaginary2 = view.getValue("Введите мнимую часть второго комплексного числа: ");
        ComplexNumber number1 = new ComplexNumber(material1, imaginary1);
        ComplexNumber number2 = new ComplexNumber(material2, imaginary2);

        model.setComplexNumber1(number1);
        model.setComplexNumber2(number2);

        ComplexNumber result = model.result();
        view.print(result, "Ответ: ");

    }
}
