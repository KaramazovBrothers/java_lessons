package my.example;

public class Animal {
   protected String location;
    protected String food;



    public Animal(String location, String food) {
        this.location = location;
        this.food = food;
    }

    public void makeNoise() {
        System.out.println("Это животное издаёт такой-то звук");
    }

    public void eat(){
        System.out.println("У этого животного такой-то тип питания");
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }
}
