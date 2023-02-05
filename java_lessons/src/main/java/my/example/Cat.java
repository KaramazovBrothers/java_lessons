package my.example;

public class Cat extends Animal{
    private String name;

    public Cat(String location, String food, String name) {
        super(location, food);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Мурчит и мяукает");
    }
    @Override
    public void eat() {
        System.out.println("Всеядное");
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
