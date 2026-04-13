import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lab13 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("1: " + sum.apply(5, 3));

        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2: " + toUpper.apply("hello"));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.println("3: " + n));

        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.println("4: " + n));

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("5: " + max.orElse(0));

        List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Code");
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(s -> System.out.println("6: " + s));

        words.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(s -> System.out.println("7: " + s));

        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.println("8: " + s));

        numbers.forEach(System.out::println);

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("10: " + min.orElse(0));

        Consumer<String> printer = s -> System.out.println("11: " + s);
        printer.accept("Hello Consumer");

        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("12: " + random.get());

        List<Student> students = getStudents();
        students.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(s -> System.out.println("13: " + s));

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println("14: " + s));

        numbers.stream()
                .filter(n -> n > 2)
                .map(n -> n * 10)
                .sorted()
                .forEach(n -> System.out.println("15: " + n));

        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));
        System.out.println("16: " + grouped);

        int total = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("17: " + total);

        List<Integer> nums = Arrays.asList(1,1,2,2,3,4,5);
        nums.stream()
                .distinct()
                .limit(3)
                .forEach(n -> System.out.println("18: " + n));

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(n -> System.out.println("19: " + n));

        List<Integer> orders = Arrays.asList(500, 1500, 2000, 700);
        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(o -> System.out.println("20: " + o));
    }

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " (" + age + ", " + grade + ")";
        }
    }

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 22, 90),
                new Student("Max", 20, 70),
                new Student("Sara", 21, 95)
        );
    }
}
