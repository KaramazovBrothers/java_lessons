package my.example;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Наименование книги: ".concat(nameBook));
    }

    String nameBook;

    public String getNameBook() {
        return nameBook;
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

}
