package my.example;

public class Main {
    public static void main(String[] args) {
        Engineer Karl = new Engineer("Karl", "Gaus", "Shoot", 111);
        Karl.displayInfo();
        Engineer John = new Engineer("John", "Connor", "The Savior of humanity", 222);
        John.displayInfo();
        Engineer Elon = new Engineer("Elon", "Musk", "Reptiloid", 333);
        Elon.displayInfo();

        Mashina Spider = new Mashina(350, 3, 7, "Spider");
        Spider.displayInfo2();
        Mashina Viper = new Mashina(300, 7, 7, "Viper");
        Viper.displayInfo2();
        Mashina Glider = new Mashina(361, 3, 1, "Glider");
        Glider.displayInfo2();
    }
}



