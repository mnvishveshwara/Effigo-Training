
public class Store {

    Movie[] movie;

    public Store() {
        this.movie = new Movie[10];

    }

    public Movie getMovie(int index) {

        return new Movie(movie[index]);
    }

    public void setMovie(int index, Movie movie) {
        this.movie[index] = new Movie(movie);
    }

    @Override
    public String toString() {
        String temp = "";
        for (Movie movie : movie) {
                temp += movie.toString() + "\n";
            }

            return temp;

        }

    

}
