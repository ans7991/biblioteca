import junit.framework.Assert;
import org.junit.Test;

public class BiblioticaTest {

    Bibliotica NewCustomer = new Bibliotica();
    @Test
    public void testWelcomeMessage() throws Exception {
        String expectedResult = "Hello Customer!";
        Assert.assertEquals(expectedResult, NewCustomer.WelcomeMessage());
    }

    @Test
    public void testViewBooks() throws Exception {
        String expectedResult = "The Following books are Available:";
        Assert.assertEquals(expectedResult, NewCustomer.ViewBooks());
    }

    @Test
    public void testReserveABook() throws Exception {

    }

    @Test
    public void testCheckLibraryNumber() throws Exception {
        String expectedResult = "Please Talk to Librarian. Thank You.";
        Assert.assertEquals(expectedResult, NewCustomer.CheckLibraryNumber());
    }

    @Test
    public void testNotValidOption() throws Exception {
        String expectedResult = "Select a Valid Option!";
        Assert.assertEquals(expectedResult, NewCustomer.NotValidOption());
    }
}
