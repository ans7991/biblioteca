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
        PublicLibraryMenu User = new PublicLibraryMenu();
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        User.ExecuteChoice(choice, books);
        String expectedResult = "The following books are available.." + separator + "101  Gone with the Wind" + separator;
        Assert.assertEquals(expectedResult, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsTwo()
    {
        PublicLibraryMenu User = new PublicLibraryMenu();
        Bibliotica NewUser = new Bibliotica();
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        String exResult = "Thank You! Enjoy the Book.";
        Assert.assertEquals(exResult, NewUser.ReserveABook(101, books));
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsThree()
    {
        PublicLibraryMenu User = new PublicLibraryMenu();
        System.setOut(ps);
        int choice = 3;
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        User.ExecuteChoice(choice, books);
        Assert.assertEquals("Please Talk to Librarian. Thank You." + separator, os.toString());
    }

    @Test
    public void testExecuteChoiceWhenChoiceIsAnyOther()
    {
        PublicLibraryMenu User = new PublicLibraryMenu();
        System.setOut(ps);
        int choice = 5;
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        User.ExecuteChoice(choice, books);
        Assert.assertEquals("Select a Valid Option!" + separator, os.toString());
    }
}
