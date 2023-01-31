package my.example;

public class Mashina {
    int speed;
    int timeToLimit;
    int timeToStop;
    String markCar= "Ferrari";
    int difference;
    String result2;

    public Mashina(int speed, int timeToLimit, int timeToStop, String markCar){
        this.speed = speed;
        this.timeToLimit = timeToLimit;
        this.timeToStop = timeToStop;
        this.markCar = markCar;
        difference = timeToLimit - timeToStop;
        if (difference >= 0) {
            result2 = "Good_car";
        }
        else if (difference < 0) {
            result2 = "Bad car";

        }

    }

    public void displayInfo2() {
        System.out.println("\n" + "Speed:" + speed + "\nDifference:" + difference + "\nGoodOrNo:" + result2);
    }

    public int getSpeed() {
        return speed;
    }

    public int getTimeToLimit() {
        return timeToLimit;
    }

    public int getTimeToStop() {
        return timeToStop;
    }

    public String getMarkCar() {
        return markCar;
    }
}
