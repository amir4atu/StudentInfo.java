public class Lab2 {

    public static void Lab2(String[] args) {

        int number = 10;
        double price = 99.99;
        char grade = 'A';
        final double PI = 3.14159;

        System.out.println("Задача 1:");
        System.out.println("Целое число: " + number);
        System.out.println("Дробное число: " + price);
        System.out.println("Символ: " + grade);
        System.out.println("Константа PI: " + PI);
        System.out.println();

        int age = 25;
        String name = "Алексей";

        System.out.println("Задача 2:");
        System.out.println("Примитивный тип int: " + age);
        System.out.println("Ссылочный тип String: " + name);
        System.out.println();

        ScopeExample scopeExample = new ScopeExample();
        System.out.println("Задача 3:");
        scopeExample.showScope();
        System.out.println();

        System.out.println("Задача 4 и 5:");
        Person person = new Person();
        person.name = "Олег";
        person.age = 40;
        person.displayInfo();
        System.out.println();

        Person student = new Student();
        student.name = "Мария";
        student.age = 19;
        ((Student) student).group = "ИС-2204";
        student.displayInfo();
    }
}

class ScopeExample {

    int classField = 50;

    void showScope() {
        int localVariable = 100;
        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
    }
}

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}