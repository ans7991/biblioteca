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
        menu.executeChoice(choice, library);
        String expectedResult = "The following books are available.." + separator;
        for(int i=0;i<bookLibrary.books.size();i++)
            expectedResult = expectedResult + bookLibrary.books.get(i).getBookNo() + "  " + bookLibrary.books.get(i).getBookName() + separator;
        Assert.assertEquals(expectedResult, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsTwo()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica Library = new Bibliotica();
        String exResult = "Thank You! Enjoy the Book.";
        Assert.assertEquals(exResult, Library.bookLibrary.reserveABook(101));
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsThree()
    {
        Bibliotica library = new Bibliotica();
        PublicLibraryMenu menu = new PublicLibraryMenu();
        System.setOut(ps);
        int choice = 3;
        menu.executeChoice(choice, library);
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
        menu.executeChoice(choice, library);
        String expectedResult = "Movies Name   Director   Rating" + separator;
        for(int i=0;i<movieLibrary.movies.size();i++)
        {
            expectedResult = expectedResult + movieLibrary.movies.get(i).getMovieName() + "   " + movieLibrary.movies.get(i).getDirector() + "   ";
            if(!movieLibrary.movies.get(i).isNew)
                expectedResult = expectedResult + movieLibrary.movies.get(i).getRating() + separator;
            else
                expectedResult = expectedResult + Movie.RATING_NEW_MOVIE + separator;
        }
        Assert.assertEquals(expectedResult, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsFiveWithCorrectLogin()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica library = new Bibliotica();
        System.setOut(ps);
        User user = new User("111-1113", "abcd");
        library.userList.checkPassword(user);
        Assert.assertEquals("You are logged in." + separator, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsFiveWithIncorrectLogin()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica library = new Bibliotica();
        System.setOut(ps);
        User user = new User("1111114", "7991");
        library.userList.checkPassword(user);
        Assert.assertEquals("Wrong Username or Password." + separator, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsAnyOther()
    {
        PublicLibraryMenu menu = new PublicLibraryMenu();
        Bibliotica library = new Bibliotica();
        System.setOut(ps);
        int choice = 8;
        menu.executeChoice(choice, library);
        Assert.assertEquals("Select a Valid Option!" + separator, os.toString());
    }
}