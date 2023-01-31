package my.example;

public class Sun {
    public static void main(String[] args) {
        Sunset one = new Sunset();
        one.sunset();
        one.sunset();
        one.sunset();
        one.displayInfo();
    }
}

class Sunset {
    static int counter = 0;

    public void sunset() {
        counter += 1;
    }



    public void displayInfo() {
        System.out.println(counter);

    }
}




