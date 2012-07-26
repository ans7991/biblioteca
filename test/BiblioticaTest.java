import junit.framework.Assert;
import org.junit.Test;

public class BiblioticaTest
{

    @Test
    public void testWelcomeMessage() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Hello Customer!";
        Assert.assertEquals(expectedResult, library.WelcomeMessage());
    }

    @Test
    public void testReserveABookWithBookFound() throws Exception {
        int bookNo = 101;
        Bibliotica library = new Bibliotica();
        Assert.assertEquals("Thank You! Enjoy the Book.", library.ReserveABook(bookNo));
    }

    @Test
    public void testReserveABookWithBookNotFound() throws Exception {
        int bookNo = 112;
        Bibliotica library = new Bibliotica();
        Assert.assertEquals("Sorry! We don't have that book yet.", library.ReserveABook(bookNo));
    }

    @Test
    public void testCheckLibraryNumber() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Please Talk to Librarian. Thank You.";
        Assert.assertEquals(expectedResult, library.CheckLibraryNumber());
    }

    @Test
    public void testNotValidOption() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Select a Valid Option!";
        Assert.assertEquals(expectedResult, library.NotValidOption());
    }
}
