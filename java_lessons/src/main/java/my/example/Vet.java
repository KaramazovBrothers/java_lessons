package my.example;

public class Vet {
    public void treatAnimal(Animal animal) {

        System.out.println(animal.toString());
        animal.makeNoise();
        System.out.println();

    }
}
