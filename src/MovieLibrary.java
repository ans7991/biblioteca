import java.util.ArrayList;

public class MovieLibrary
{
    ArrayList<Movie> Movies = new ArrayList<Movie>();

    MovieLibrary()
    {
        Movies.add(new Movie("Sholay", "Ramesh Sippy", 10));
        Movies.add(new Movie("Confidence", "Steven Spielberg", 9));
        Movies.add(new Movie("Titanic", "James Cameroon", 10));
        Movies.add(new Movie("Pardes", "Karan Johar", 8));
        Movies.add(new Movie("Dark Knight", "Christopher"));
        Movies.add(new Movie("Gladiator", "Steven Sodenberg", 7));
        Movies.add(new Movie("3 Idiots", "Raj Kumar", 9));
        Movies.add(new Movie("Spiderman 3", "C. Niels"));
        Movies.add(new Movie("Avatar", "James Cameroon", 8));
        Movies.add(new Movie("Golmaal 3", "Rohan Shetty"));
        Movies.add(new Movie("Bol Bachchan", "Rohan Shetty"));
        Movies.add(new Movie("CockTail", "Raj Kumar"));
        Movies.add(new Movie("300", "Steven Spielberg", 7));
        Movies.add(new Movie("Iron Man", "Tony Stark", 6));
        Movies.add(new Movie("Rambo", "Sylvestor", 6));
    }
}
