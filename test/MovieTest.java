import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MovieTest
{
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    String separator = System.getProperty("line.separator");

    @Test
    public void testgetRating() throws Exception
    {
        Movie movie = new Movie("Hera Pheri", "Suniel", 10);
        String rating = movie.getRating();
        Assert.assertEquals("*****", rating);
    }

    @Test
    public void testDisplayMovie() throws Exception
    {
        System.setOut(ps);
        Movie movie = new Movie("Golmaal", "Rohan Shetty");
        movie.displayMovie();
        String expectedResult = "Golmaal   Rohan Shetty   N/A" + separator;
        Assert.assertEquals(expectedResult, os.toString());
    }
}
