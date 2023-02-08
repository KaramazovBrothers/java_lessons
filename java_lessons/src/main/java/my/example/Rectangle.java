package my.example;

public class Rectangle extends GeometricForm {
    int a;
    int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    void perimetr() {
        int storona[] = {a, b};
        int perimetr = 0;
        for (int i = 0; i < storona.length; i++) {
            perimetr = perimetr + storona[i];
        }
        System.out.println("Периметр прямоугольника=" + perimetr * 2);

    }
}
