package homework2;

import homework2.Arithmetic.*;

public class Logic {
    public static void logic(String firstString, String arithmetic, String secondString) {
        int first = 0;
        int second = 0;
        int result = 0;

        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
        } catch (Exception e) {
            System.out.println("Вы ввели не верные данные!");
        }
        if (first < 1 || first > 10 || second < 1 || second > 10) {
            System.out.println("Вы ввели не верные данные!");
            System.exit(0);
        }
        Action action;
        if (arithmetic.equals("-")) {
            action = new Difference();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("*")) {
            action = new Multi();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("/")) {
            action = new Division();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("+")) {
            action = new Addition();
            result = action.invoke(first, second);
        } else
            System.out.println(result);
    }
}
