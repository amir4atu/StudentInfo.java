// ===== ЗАДАЧА 1 =====
class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displaySpeed() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    void fuelConsumption() {
        System.out.println("Fuel consumption data not available");
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Sedan fuel consumption: 7L/100km");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Truck fuel consumption: 20L/100km");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("SUV fuel consumption: 10L/100km");
    }
}

// ===== ЗАДАЧА 2 =====
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Tweet");
    }
}

// ===== ЗАДАЧА 3 =====
class Person {
    String firstName;
    String lastName;

    Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    int studentId;

    Student(String f, String l, int id) {
        super(f, l);
        studentId = id;
    }

    void study() {
        System.out.println(firstName + " is studying.");
    }
}

class Professor extends Person {
    String subject;

    Professor(String f, String l, String s) {
        super(f, l);
        subject = s;
    }

    void teach() {
        System.out.println(firstName + " is teaching " + subject + ".");
    }
}

// ===== ВАРИАНТ 1 =====
class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " moves at speed " + speed + " km/h");
    }
}

class CarTransport extends Transport {
    CarTransport() { super("Car", 120); }
}

class Train extends Transport {
    Train() { super("Train", 200); }
}

class Airplane extends Transport {
    Airplane() { super("Airplane", 800); }
}

// ===== ВАРИАНТ 2 =====
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// ===== ВАРИАНТ 3 =====
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    Manager() {
        super("Manager", 5000);
    }
}

class Developer extends Employee {
    Developer() {
        super("Developer", 4000);
    }
}

class Designer extends Employee {
    Designer() {
        super("Designer", 3500);
    }
}

// ===== ВАРИАНТ 4 =====
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CreditAccount extends BankAccount {
    CreditAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

// ===== ВАРИАНТ 5 =====
class Teacher extends Person {
    Teacher(String f, String l) {
        super(f, l);
    }
    void teach() {
        System.out.println(firstName + " is teaching.");
    }
}

class Administrator extends Person {
    Administrator(String f, String l) {
        super(f, l);
    }
    void manage() {
        System.out.println(firstName + " is managing.");
    }
}

// ===== ВАРИАНТ 6 =====
class Device {
    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " device is turned on.");
    }
}

class Laptop extends Device {
    Laptop() { super("Laptop", 65); }
}

class Smartphone extends Device {
    Smartphone() { super("Smartphone", 20); }
}

class Tablet extends Device {
    Tablet() { super("Tablet", 30); }
}

// ===== ВАРИАНТ 7 =====
class Lion extends Animal {
    Lion() { super("Lion"); }

    @Override
    void sound() {
        System.out.println("Lion roars!");
    }
}

class Elephant extends Animal {
    Elephant() { super("Elephant"); }

    @Override
    void sound() {
        System.out.println("Elephant trumpets!");
    }
}

class Monkey extends Animal {
    Monkey() { super("Monkey"); }

    @Override
    void sound() {
        System.out.println("Monkey chatters!");
    }
}

// ===== ВАРИАНТ 8 =====
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

class Bike extends Vehicle {}
class Bus extends Vehicle {}
class Taxi extends Vehicle {}

// ===== ВАРИАНТ 9 =====
class Component {
    void showInfo() {
        System.out.println("Component info");
    }
}

class CPU extends Component {}
class RAM extends Component {}
class GPU extends Component {}

// ===== ВАРИАНТ 10 =====
class Product {
    double price;

    void showPrice() {
        System.out.println("Price: $" + price);
    }
}

class Food extends Product {}
class Electronics extends Product {}
class Clothes extends Product {}

// ===== ВАРИАНТ 11 =====
class TeamMember {}

class Player extends TeamMember {
    void play() {
        System.out.println("Playing");
    }
}

class Coach extends TeamMember {
    void train() {
        System.out.println("Training");
    }
}

class Doctor extends TeamMember {
    void heal() {
        System.out.println("Healing");
    }
}

// ===== ВАРИАНТ 12 =====
class Instrument {
    void playSound() {
        System.out.println("Instrument sound");
    }
}

class Guitar extends Instrument {}
class Piano extends Instrument {}
class Drums extends Instrument {}

// ===== ВАРИАНТ 13 =====
class Course {
    void startCourse() {
        System.out.println("Course started");
    }
}

class ProgrammingCourse extends Course {}
class MathCourse extends Course {}
class HistoryCourse extends Course {}

// ===== ВАРИАНТ 14 =====
class Character {
    void attack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends Character {}
class Mage extends Character {}
class Archer extends Character {}

// ===== ВАРИАНТ 15 =====
class Appliance {
    void operate() {
        System.out.println("Appliance operating");
    }
}

class Refrigerator extends Appliance {}
class WashingMachine extends Appliance {}
class Microwave extends Appliance {}

// ===== MAIN =====
public class Lab9 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 180);
        sedan.displaySpeed();
        sedan.fuelConsumption();

        Dog dog = new Dog("Buddy");
        dog.sound();

        Cat cat = new Cat("Whiskers");
        cat.sound();

        Student student = new Student("Ali", "Khan", 12345);
        student.displayInfo();
        student.study();

        Professor professor = new Professor("Dr. John", "Doe", "Mathematics");
        professor.displayInfo();
        professor.teach();

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.area());

        Triangle triangle = new Triangle(3, 7);
        System.out.println("Triangle area: " + triangle.area());

        Laptop laptop = new Laptop();
        laptop.turnOn();

        CarTransport car = new CarTransport();
        car.move();

        Player player = new Player();
        player.play();

        Warrior warrior = new Warrior();
        warrior.attack();

        Refrigerator fridge = new Refrigerator();
        fridge.operate();

        Lion lion = new Lion();
        lion.sound();

        Elephant elephant = new Elephant();
        elephant.sound();

        Monkey monkey = new Monkey();
        monkey.sound();

        BankAccount savings = new SavingsAccount(1111, 1000);
        savings.deposit(200);
        savings.withdraw(150);

        Teacher teacher = new Teacher("Anna", "Smith");
        teacher.teach();

        Administrator admin = new Administrator("Bob", "Brown");
        admin.manage();

        Smartphone phone = new Smartphone();
        phone.turnOn();
    }
}