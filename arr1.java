import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Movie {
    private String title;
    private int releaseYear;
    private double rating;

    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Release Year: " + releaseYear + ", Rating: " + rating;
    }
}

class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare(movie1.getRating(), movie2.getRating());
    }
}

public class arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMovies = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character.

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < numMovies; i++) {
            String title = scanner.nextLine();
            int releaseYear = scanner.nextInt();
            double rating = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character.

            Movie movie = new Movie(title, releaseYear, rating);
            movies.add(movie);
        }

        Collections.sort(movies, new MovieComparator());

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
