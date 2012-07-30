import java.util.ArrayList;

public class MovieLibrary
{
    ArrayList<Movie> movies = new ArrayList<Movie>();

    MovieLibrary()
    {
        movies.add(new Movie("Sholay", "Ramesh Sippy", 10));
        movies.add(new Movie("Confidence", "Steven Spielberg", 9));
        movies.add(new Movie("Titanic", "James Cameroon", 10));
        movies.add(new Movie("Pardes", "Karan Johar", 8));
        movies.add(new Movie("Dark Knight", "Christopher"));
        movies.add(new Movie("Gladiator", "Steven Sodenberg", 7));
        movies.add(new Movie("3 Idiots", "Raj Kumar", 9));
        movies.add(new Movie("Spiderman 3", "C. Niels"));
        movies.add(new Movie("Avatar", "James Cameroon", 8));
        movies.add(new Movie("Golmaal 3", "Rohan Shetty"));
        movies.add(new Movie("Bol Bachchan", "Rohan Shetty"));
        movies.add(new Movie("CockTail", "Raj Kumar"));
        movies.add(new Movie("300", "Steven Spielberg", 7));
        movies.add(new Movie("Iron Man", "Tony Stark", 6));
        movies.add(new Movie("Rambo", "Sylvestor", 6));
    }

    public void listMovies()
    {
        for(int i=0;i<movies.size();i++)
            movies.get(i).displayMovie();
    }
}
