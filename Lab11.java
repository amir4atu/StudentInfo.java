import java.util.*;

public class Lab11 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();

            int choice = getIntInput("Выберите операцию: ");

            double a = 0, b = 0, result = 0;
            String record = "";

            switch (choice) {
                case 1:
                    a = getDoubleInput("Введите первое число: ");
                    b = getDoubleInput("Введите второе число: ");
                    result = add(a, b);
                    record = a + " + " + b + " = " + result;
                    break;

                case 2:
                    a = getDoubleInput("Введите первое число: ");
                    b = getDoubleInput("Введите второе число: ");
                    result = subtract(a, b);
                    record = a + " - " + b + " = " + result;
                    break;

                case 3:
                    a = getDoubleInput("Введите первое число: ");
                    b = getDoubleInput("Введите второе число: ");
                    result = multiply(a, b);
                    record = a + " * " + b + " = " + result;
                    break;

                case 4:
                    a = getDoubleInput("Введите первое число: ");
                    b = getDoubleInput("Введите второе число: ");
                    result = divide(a, b);
                    record = a + " / " + b + " = " + result;
                    break;

                case 5:
                    a = getDoubleInput("Введите число: ");
                    b = getDoubleInput("Введите степень: ");
                    result = Math.pow(a, b);
                    record = a + " ^ " + b + " = " + result;
                    break;

                case 6:
                    a = getDoubleInput("Введите число: ");
                    result = Math.sqrt(a);
                    record = "√" + a + " = " + result;
                    break;

                case 7:
                    a = getDoubleInput("Введите число: ");
                    result = Math.sin(a);
                    record = "sin(" + a + ") = " + result;
                    break;

                case 8:
                    a = getDoubleInput("Введите число: ");
                    result = Math.cos(a);
                    record = "cos(" + a + ") = " + result;
                    break;

                case 9:
                    a = getDoubleInput("Введите число: ");
                    result = Math.tan(a);
                    record = "tan(" + a + ") = " + result;
                    break;

                case 10:
                    a = getDoubleInput("Введите процент: ");
                    b = getDoubleInput("От какого числа: ");
                    result = (a / 100) * b;
                    record = a + "% от " + b + " = " + result;
                    break;

                case 11:
                    showHistory();
                    continue;

                case 12:
                    clearScreen();
                    continue;

                case 0:
                    running = false;
                    System.out.println("Выход...");
                    continue;

                default:
                    System.out.println("Неверный выбор!");
                    continue;
            }

            System.out.println("Результат: " + result);
            history.add(record);
        }
    }

    public static void printMenu() {
        System.out.println("\n===== КАЛЬКУЛЯТОР =====");
        System.out.println("1 – Сложение");
        System.out.println("2 – Вычитание");
        System.out.println("3 – Умножение");
        System.out.println("4 – Деление");
        System.out.println("5 – Степень (x^y)");
        System.out.println("6 – Квадратный корень");
        System.out.println("7 – sin");
        System.out.println("8 – cos");
        System.out.println("9 – tan");
        System.out.println("10 – Процент");
        System.out.println("11 – История");
        System.out.println("12 – Очистить экран");
        System.out.println("0 – Выход");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a / b;
    }

    public static double getDoubleInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
        }
    }

    public static int getIntInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }
    }

    public static void showHistory() {
        System.out.println("\n=== История ===");
        if (history.isEmpty()) {
            System.out.println("Пусто");
        } else {
            for (String s : history) {
                System.out.println(s);
            }
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        System.out.println("Экран очищен.");
    }
}
