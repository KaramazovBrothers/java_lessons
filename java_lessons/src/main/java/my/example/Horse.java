package my.example;

public class Horse extends Animal{
    private String name;

    public Horse(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Издаёт Игооооого и фырчит");
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
