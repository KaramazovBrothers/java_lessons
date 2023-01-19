package my.example;

public class Main {
    public static int age;
    public static String name;
    public static final String URL_TO_ADMIN = "https://tratata";

    public static void printNameAndAge () {
        age = 17;
        name = "DK";
        System.out.println(name + " " + age);
        //Одиночный символ в кодировке UTF-16. Используем одинарные кавычки
        char f = 'f';
        System.out.println(f);
        //Оператор присваивания += и интовая расширенная переменная
        Integer iPhone = 1;
        iPhone += 2;
        System.out.println(iPhone);
        iPhone -= 5; // из iPhone вычитается 5
        System.out.println(iPhone);
        iPhone /= -2; // iPhone разделить на -2
        System.out.println(iPhone);
        //Остаток от деления
        int y = 7;
        int z = 3;
        System.out.println(y % z + " " + "остаток от деления");
        //числа c плавающей точкой. Ставим F на конце, иначе это double
        float fl = 4.8F;
        double dl = 15.16;
        System.out.println(fl + "." + dl + " " + "числа с плавающей точкой");
        //Деление с плавающей точкой
        float x = 5f;
        float t = 3f;
        System.out.println(x / t + " " + "деление с остатком");
        //Инкремент и декремент
        int q = 1;
        q++;
        System.out.println(q + " " + "Инкремент");
        //строчный. Используем двойные кавычки
        String secondF = "The";
        String thirdString = "Elder";
        String fourString = "Scroll";
        System.out.println(secondF + " " + thirdString + " " + fourString + " " + URL_TO_ADMIN);
        //операторы сравненния
        System.out.println(y == x);
        System.out.println(y != x);
        System.out.println((y > x) | (q > z)); //вычисляет две части
        System.out.println((y < x) || (z > q)); //вычисляет только одну, если первая true
        System.out.println((y < x) & (z > q)); // двойной также высчитывает только первую часть, если она false
    }

    public static void main(String[] args) {
        printNameAndAge();
    }
}