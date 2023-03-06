package Utilities;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    private static Faker faker = new Faker();

    public static String generateLiteralString() {
        return faker.letterify("????????");
    }

    public static String generateNumberString() {
        return  faker.numerify("########");
    }

    public static String generateNumberLiteral() {
        return faker.bothify("???#####", true);
    }

    public static Integer generateNumberBetween() {
        return faker.number().numberBetween(100, 1000);
    }

    public static String generateLogin() {
        return faker.name().firstName();
    }

    public static String generatePassword() {
        return faker.bothify("????#####");
    }

    public static void main(String[] args) {
        System.out.println(generateLiteralString());
        System.out.println(generateNumberString());
        System.out.println(generateNumberLiteral());
        System.out.println(generateNumberBetween());
    }
}
