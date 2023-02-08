package my.example;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Наименование журнала: ".concat(nameMagazine));

    }

    String nameMagazine;

    public String getNameBook() {
        return nameMagazine;
    }

    public Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

}

