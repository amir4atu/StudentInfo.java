import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }
    }
}

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите балл (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Оценка: 5");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Оценка: 4");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Оценка: 3");
        } else if (score >= 30 && score <= 49) {
            System.out.println("Оценка: 2");
        } else if (score >= 0 && score <= 29) {
            System.out.println("Оценка: 1");
        } else {
            System.out.println("Некорректный балл.");
        }
    }
}

class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Первое число больше второго.");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого.");
        } else {
            System.out.println("Числа равны.");
        }
    }
}

class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный номер дня.");
        }
    }
}

class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }
    }
}

class AgeAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён.");
        } else {
            System.out.println("Доступ запрещён.");
        }
    }
}

class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 день");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 дней");
                break;
            case 2:
                System.out.println("28 дней (невисокосный год)");
                break;
            default:
                System.out.println("Некорректный месяц.");
        }
    }
}

class TemperatureState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        double temp = scanner.nextDouble();

        if (temp < 10) {
            System.out.println("Холодно");
        } else if (temp >= 10 && temp <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}

class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("Число в диапазоне 1-100.");
        } else {
            System.out.println("Число вне диапазона.");
        }
    }
}

class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                }
                break;
            default:
                System.out.println("Некорректная операция.");
        }
    }
}
