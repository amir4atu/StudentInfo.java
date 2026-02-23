import java.util.Scanner;

public class Lab3 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Задание 1. Сумма и среднее арифметическое двух чисел
    System.out.print("Введите первое число: ");
    double a = scanner.nextDouble();

    System.out.print("Введите второе число: ");
    double b = scanner.nextDouble();

    double sum = a + b;
    double avg = sum / 2;

    System.out.println("Сумма: " + sum);
    System.out.println("Среднее арифметическое: " + avg);

    // Задание 2. Площадь и периметр прямоугольника
    System.out.print("Введите длину прямоугольника: ");
    double length = scanner.nextDouble();

    System.out.print("Введите ширину прямоугольника: ");
    double width = scanner.nextDouble();

    double areaRect = length * width;
    double perimeter = 2 * (length + width);

    System.out.println("Площадь прямоугольника: " + areaRect);
    System.out.println("Периметр прямоугольника: " + perimeter);

    // Задание 3. Площадь круга
    System.out.print("Введите радиус круга: ");
    double r = scanner.nextDouble();

    double pi = 3.14;
    double areaCircle = pi * r * r;

    System.out.println("Площадь круга: " + areaCircle);

    // Задание 4. Перевод температуры из Цельсия в Фаренгейт
    System.out.print("Введите температуру в градусах Цельсия: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = celsius * 9 / 5 + 32;

    System.out.println("Температура в Фаренгейтах: " + fahrenheit);

    // Задание 5. Расстояние при равномерном движении
    System.out.print("Введите скорость (v): ");
    double v = scanner.nextDouble();

    System.out.print("Введите время (t): ");
    double t = scanner.nextDouble();

    double distance = v * t;

    System.out.println("Пройденное расстояние: " + distance);

    // Задание 6. Квадрат и куб числа
    System.out.print("Введите число: ");
    double x = scanner.nextDouble();

    double square = x * x;
    double cube = x * x * x;

    System.out.println("Квадрат числа: " + square);
    System.out.println("Куб числа: " + cube);
}
}