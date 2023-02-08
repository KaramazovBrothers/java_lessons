package my.example;

public class Main {
    public static void main(String[] args) {

        GeometricForm rectangle0 = new Rectangle("Rectangle", 4, 6);
        rectangle0.perimetr();
        GeometricForm rectangle1 = new Rectangle("Rectangle", 10, 25);
        rectangle1.perimetr();
        System.out.println();

        Printable[] p = new Printable[2];
        p[0] = new Book("Оно");
        p[1] = new Magazine("People");
        for (Printable i:
             p) {
            i.print();
        }
    }
}