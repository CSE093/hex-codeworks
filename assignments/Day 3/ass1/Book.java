

public class Book {

    int id;
    String name;
    String address;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Book ID: " + id +
               "\nBook Name: " + name +
               "\nAddress: " + address;
    }
}