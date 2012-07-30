import junit.framework.Assert;
import org.junit.Test;

public class BiblioticaTest
{

    @Test
    public void testWelcomeMessage() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Hello Customer!";
        Assert.assertEquals(expectedResult, library.welcomeMessage());
    }

    @Test
    public void testCheckLibraryNumber() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Please talk to librarian. Thank You.";
        Assert.assertEquals(expectedResult, library.checkLibraryNumber());
    }

    @Test
    public void testNotValidOption() throws Exception {
        Bibliotica library = new Bibliotica();
        String expectedResult = "Select a Valid Option!";
        Assert.assertEquals(expectedResult, library.notValidOption());
    }
}