import java.text.MessageFormat;

public class Movie
{
    private String MovieName;
    private String Director;
    private int Rating;
    public boolean isNew = false;

    public static final String ratingNewMovie = "N/A";

    Movie(String MovieName, String Director, int Rating)
    {
        this.MovieName = MovieName;
        this.Director = Director;
        this.Rating = Rating;
    }

    Movie(String MovieName, String Director)
    {
        this.MovieName = MovieName;
        this.Director = Director;
        this.isNew = true;
    }

    public String getMovieName()
    {
        return this.MovieName;
    }

    public String getDirector()
    {
        return this.Director;
    }

    public String getRating()
    {
        int NumberOfStars;
        String VisualRating = "";
        NumberOfStars = this.Rating/2;
        for(int i=0;i<NumberOfStars;i++)
            VisualRating = VisualRating + "*";
        return VisualRating;
    }

    public void displayMovie()
    {
        if(!isNew)
            System.out.println(MessageFormat.format("{0}   {1}   {2}", this.MovieName, this.Director, this.getRating()));
        else
            System.out.println(MessageFormat.format("{0}   {1}   {2}", this.MovieName, this.Director, ratingNewMovie));
    }
}
