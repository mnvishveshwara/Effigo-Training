public class TestBook {
    public static void main(String[] args) {
        // Test your constructor and getter/setter methods by creating instances
        // (objects) of the Book class.
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);

        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);

        // test get method
        Book retrieveBook = store.getBook(0);
        System.out.println(retrieveBook.getTitle());

        // test update method
        Book newBook = new Book("Devil", "Darshan",9.9, 2025);
        store.setBook(newBook, 1);

        // Retrive book
        retrieveBook = store.getBook(1);
        System.out.println(retrieveBook.getTitle());

        // Test Contains method

        System.out.println(store.contains(newBook));

        // test The Sellbook method
        store.sellBook("1984");
        System.out.println(store.contains(book2));

    }
}
