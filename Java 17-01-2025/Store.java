import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        books = new ArrayList<>();
    }

    public Store(ArrayList<Book> books) {
        this.books = books;
    }

    // use Deep Copy
    public Book getBook(int index) {

        Book bookcopy = new Book(this.books.get(index));
        return bookcopy;
    }

    public void setBook(Book obj, int index) {
        books.set(index, new Book(obj));
    }

    public void addBook(Book obj) {
        books.add(new Book(obj));
    }

    public boolean contains(Book obj) {
        return books.contains(obj);
    }

    public void sellBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                return;
                }
            }
    }

}
