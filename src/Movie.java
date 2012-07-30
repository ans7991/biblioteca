import java.text.MessageFormat;

public class Movie
{
    private String movieName;
    private String director;
    private int rating;
    public boolean isNew = false;

    public static final String RATING_NEW_MOVIE = "N/A";

    Movie(String movieName, String director, int rating)
    {
        this.movieName = movieName;
        this.director = director;
        this.rating = rating;
    }

    Movie(String movieName, String director)
    {
        this.movieName = movieName;
        this.director = director;
        this.isNew = true;
    }

    public String getMovieName()
    {
        return this.movieName;
    }

    public String getDirector()
    {
        return this.director;
    }

    public String getRating()
    {
        int numberOfStars;
        String visualRating = "";
        numberOfStars = this.rating/2;
        for(int i=0;i<numberOfStars;i++)
            visualRating = visualRating + "*";
        return visualRating;
    }

    public void displayMovie()
    {
        if(!isNew)
            System.out.println(MessageFormat.format("{0}   {1}   {2}", this.movieName, this.director, this.getRating()));
        else
            System.out.println(MessageFormat.format("{0}   {1}   {2}", this.movieName, this.director, RATING_NEW_MOVIE));
    }
}
