import junit.framework.Assert;
import org.junit.Test;

public class BiblioticaTest
{

    @Test
    public void testWelcomeMessage() throws Exception {
        Bibliotica NewUserOne = new Bibliotica();
        String expectedResult = "Hello Customer!";
        Assert.assertEquals(expectedResult, NewUserOne.WelcomeMessage());
    }

    @Test
    public void testReserveABookWithBookFound() throws Exception {
        int bookNo = 101;
        Bibliotica NewUserTwo = new Bibliotica();
        Assert.assertTrue(NewUserTwo.ReserveABook(bookNo));
    }

    @Test
    public void testReserveABookWithBookNotFound() throws Exception {
        int bookNo = 112;
        Bibliotica NewUserThree = new Bibliotica();
        Assert.assertFalse(NewUserThree.ReserveABook(112));
    }

    @Test
    public void testCheckLibraryNumber() throws Exception {
        Bibliotica NewUserFour = new Bibliotica();
        String expectedResult = "Please Talk to Librarian. Thank You.";
        Assert.assertEquals(expectedResult, NewUserFour.CheckLibraryNumber());
    }

    @Test
    public void testNotValidOption() throws Exception {
        Bibliotica NewUserFive = new Bibliotica();
        String expectedResult = "Select a Valid Option!";
        Assert.assertEquals(expectedResult, NewUserFive.NotValidOption());
    }
}
