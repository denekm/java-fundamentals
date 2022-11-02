import java.util.ArrayList;

public class Theater {

    private String name;

    ArrayList<String> listOfMovies = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie) {
        listOfMovies.add(movie);
    }

    public void addReview(String movie) {
        listOfMovies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", listOfMovies=" + listOfMovies +
                '}';
    }
}
