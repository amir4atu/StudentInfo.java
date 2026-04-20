import java.util.*;

public class Lab14 {
    public static void main(String[] args) {
    }
}

class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
}

class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);
        System.out.println(count);
    }
}

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}

class MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;
        do {
            int digit = number % 10;
            if (digit > max) max = digit;
            number /= 10;
        } while (number > 0);
        System.out.println(max);
    }
}

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;
        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);
        System.out.println(original == reversed);
    }
}

class EvenDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        do {
            int digit = number % 10;
            if (digit % 2 == 0) count++;
            number /= 10;
        } while (number > 0);
        System.out.println(count);
    }
}

class RandomUntilZero {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        do {
            num = random.nextInt(10);
            System.out.println(num);
        } while (num != 0);
    }
}

class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum);
    }
}

class PasswordLengthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("OK");
    }
}

class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int min = Integer.MAX_VALUE;
        do {
            num = scanner.nextInt();
            if (num != 0 && num < min) min = num;
        } while (num != 0);
        System.out.println(min);
    }
}