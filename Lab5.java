import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1. Вывод чисел от 1 до N");
        System.out.print("Введите число N: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Задание 2. Сумма чисел от 1 до N");
        System.out.print("Введите число N: ");
        int n2 = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n2) {
            sum += i;
            i++;
        }

        System.out.println("Сумма = " + sum);
        System.out.println();

        System.out.println("Задание 3. Факториал числа");
        System.out.print("Введите число N: ");
        int n3 = scanner.nextInt();

        long factorial = 1;

        for (int j = 1; j <= n3; j++) {
            factorial *= j;
        }

        System.out.println("Факториал = " + factorial);
        System.out.println();

        System.out.println("Задание 4. Чётные числа от 1 до 100");

        int k = 1;

        while (k <= 100) {
            if (k % 2 != 0) {
                k++;
                continue;
            }
            System.out.print(k + " ");
            k++;
        }
        System.out.println("\n");

        System.out.println("Задание 5. Ввод чисел до нуля");

        int number;
        int total = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел = " + total);
        System.out.println();

        System.out.println("Дополнительное задание. Таблица умножения от 1 до 5");

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(a + "*" + b + "=" + (a * b) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}