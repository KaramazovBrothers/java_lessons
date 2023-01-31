package my.example;

public class ifSwitchLoops {

    public static void ifPlusFor() {
        for (int a = 1; a < 6; a++) {
            if (a == 1)
                System.out.println("Один");
            if (a == 2)
                System.out.println("Два");
            if (a == 3)
                System.out.println("Три");
            if (a == 4)
                System.out.println("Четыре");
            if (a == 5)
                System.out.println("Пять");
        }
    }


    public static void useSwitch() {
        for (int a = 1; a < 6; a++) {
            switch (a) {
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
            }
        }
    }


    public static void Solution() {

        int sum = 0;
        int n = 9;
        while (n < 55) {
            n++;
            if (n % 2 == 0) {
                sum = sum + n;
                n++;
            }
        }
        System.out.println("Сумма чётных чисел = " + " " + sum);
    }


    public static void main(String[] args) {
        ifPlusFor();
        System.out.println(" ");
        useSwitch();
        System.out.println(" ");
        Solution();


    }
}

