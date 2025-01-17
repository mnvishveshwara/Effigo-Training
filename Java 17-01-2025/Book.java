import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double rating;
    private double price;

    /**
     * Constructor
     * @param title
     * @param author
     * @param rating
     * @param price
     */
    public Book(String title, String author, double rating, double price) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }
    
    /**
     * Copy constructor
     * @param book
     */
    public Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.rating = book.rating;
        this.price = book.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object o){
        if (this == o){
         return true;}
         if (!(o instanceof Book)) {
            return false;
         }

         Book book= (Book) o;
         return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(rating, book.rating) && Objects.equals(price, book.price);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        long temp;
        temp = Double.doubleToLongBits(rating);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }



    
    
}
