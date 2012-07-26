import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PublicLibraryMenuTest
{

    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    String separator = System.getProperty("line.separator");

    @Test
    public void testExecuteChoiceWhenChoiceIsOne()
    {
        System.setOut(ps);
        int choice = 1;
        Bibliotica library = new Bibliotica();
        BookLibrary bookLibrary = new BookLibrary();
        PublicLibraryMenu menu = new PublicLibraryMenu();
        menu.ExecuteChoice(choice, library);
        String expectedResult = "The following books are available.." + separator;
        for(int i=0;i<bookLibrary.Books.size();i++)
            expectedResult = expectedResult + bookLibrary.Books.get(i).getBookNo() + "  " + bookLibrary.Books.get(i).getBookName() + separator;
        Assert.assertEquals(expectedResult, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsTwo()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica Library = new Bibliotica();
        String exResult = "Thank You! Enjoy the Book.";
        Assert.assertEquals(exResult, Library.ReserveABook(101));
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsThree()
    {
        Bibliotica library = new Bibliotica();
        PublicLibraryMenu menu = new PublicLibraryMenu();
        System.setOut(ps);
        int choice = 3;
        menu.ExecuteChoice(choice, library);
        Assert.assertEquals("Please talk to librarian. Thank You." + separator, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsFour()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica library = new Bibliotica();
        MovieLibrary movieLibrary = new MovieLibrary();
        System.setOut(ps);
        int choice = 4;
        menu.ExecuteChoice(choice, library);
        String expectedResult = "Movies Name   Director   Rating" + separator;
        for(int i=0;i<movieLibrary.Movies.size();i++)
        {
            expectedResult = expectedResult + movieLibrary.Movies.get(i).getMovieName() + "   " + movieLibrary.Movies.get(i).getDirector() + "   ";
            if(!movieLibrary.Movies.get(i).isNew)
                expectedResult = expectedResult + movieLibrary.Movies.get(i).getRating() + separator;
            else
                expectedResult = expectedResult + Movie.ratingNewMovie + separator;
        }
        Assert.assertEquals(expectedResult, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsFive()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica Library = new Bibliotica();
        System.setOut(ps);
        User user = new User("111-1113", "abcd");
        Library.checkPassword(user);
        Assert.assertEquals("You are logged in." + separator, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsAnyOther()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica library = new Bibliotica();
        System.setOut(ps);
        int choice = 8;
        menu.ExecuteChoice(choice, library);
        Assert.assertEquals("Select a Valid Option!" + separator, os.toString());
    }
}
