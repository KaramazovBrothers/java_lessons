package my.example;

public class StringDemo {
    public static void main(String[] args){
        String string0 = "I Like Java";

        System.out.println(string0.substring(10));
        System.out.println(string0.contains("Java"));
        System.out.println(string0.replace("a", "o"));
        System.out.println(string0.toUpperCase());
        System.out.println(string0.toLowerCase());
        System.out.println(string0.substring(2,6)); //Чуть-чуть усложнил и вырезал из середины Like

        String string1 = String.format("Корж %s Корж", "Крем");
        System.out.println(string1);

    }

}
