package my.example;

public class Main {
    public static int age;
    public static String name;

    public static void printNameAndAge () {
        age = 17;
        name = "DK";
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        printNameAndAge();
    }
}