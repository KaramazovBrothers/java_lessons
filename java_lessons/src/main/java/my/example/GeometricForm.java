package my.example;

public abstract class GeometricForm {
    private String name;

    public GeometricForm(String name) {
        this.name = name;
    }

    abstract void perimetr();

    public String getName() {
        return name;
    }
}
