package exam;

import java.util.Scanner;

import exam.model.Division;
import exam.model.Multiplication;
import exam.model.Sum;
import exam.presenter.Presenter;
import exam.view.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nВведите номер программы, соответствующий дейтствию, которое" +
                " вы хотите выполнить с двумя комплексными числами:" +
                "\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n0 - выход из программы");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int chois = scanner.nextInt();
            switch (chois) {
                case 1:
                    Presenter s = new Presenter(new Sum(), new View());
                    s.runCalc();
                    flag = false;
                    break;
                case 2:
                    Presenter p = new Presenter(new Division(), new View());
                    p.runCalc();
                    flag = false;
                    break;
                case 3:
                    Presenter r = new Presenter(new Multiplication(), new View());
                    r.runCalc();
                    flag = false;
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    break;

            }

        }
        scanner.close();
    }
}
