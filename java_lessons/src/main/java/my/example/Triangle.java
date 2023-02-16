package my.example;

public class Triangle {
    private double a, b, c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if((a+b) < c || (b+c) < a || (c+a) < b) {
            throw new TriangleImpossibleException();
        }
    }

    public double getArea() {
        double p, s;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) *  (p - b) * (p - c));
        return s;
    }
}
