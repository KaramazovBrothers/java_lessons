package my.example;

public class TriangleImpossibleException extends RuntimeException{

    @Override
    public String toString() {
        return "Triangle is impossible";
    }
}
