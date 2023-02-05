package my.example;

public class Parrot extends Animal{
    private String name;

    public Parrot(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Чирикает");
    }
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    @Override
    public void eat() {
        System.out.println("Растительноядное");
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public String getFood() {
        return food;
    }
    @Override
    public String toString() {
        return location + "/" + food;
    }
}
