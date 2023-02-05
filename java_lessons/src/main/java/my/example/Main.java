package my.example;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[4];
        animal[0] = new Dog("Алабама", "Корм", "Кайзер");
        animal[1] = new Cat("catLocation", "catFood", "catName");
        animal[2] = new Horse("horseLocation", "horseFood","horseName");
        animal[3] = new Parrot("Зимбабве", "Фундук", "Георгий");

        Vet vet = new Vet();

        for (Animal animals : animal) {
            vet.treatAnimal(animals);
        }
    }
}