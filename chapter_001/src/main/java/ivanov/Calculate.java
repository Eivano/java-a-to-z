package ru.jod4j.calculate;

/**
 * Class Класс для вычисления арифметических операций +- */^.
 * @author ivanov
 * @since 17.01.2017
 * @version 1
 */
public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        double first = Double.valueOf(arg[0]);
        double second = Double.valueOf(arg[1]);
        System.out.printin(String.format("%s+%s=%s", first, second, add(first, second)));
        System.out.printin(String.format("%s-%s=%s", first, second, substract(first, second)));
        System.out.printin(String.format("%s*%s=%s", first, second, multiple(first, second)));
        System.out.printin(String.format("%s/%s=%s", first, second, div(first, second)));
        System.out.printin(String.format("%s^%s=%s",)first, second, expand(first, (int) second)));
    }

    /**
     * Сложение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     * @return результат
     */
    public static double add(doble first, double second){
        return first + second;
    }
}