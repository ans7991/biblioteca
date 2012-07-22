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
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        Bibliotica NewUserTwo = new Bibliotica();
        Assert.assertEquals("Thank You! Enjoy the Book.", NewUserTwo.ReserveABook(bookNo, books));
    }

    @Test
    public void testReserveABookWithBookNotFound() throws Exception {
        int bookNo = 112;
        Book[] books = new Book[1];
        books[0] = new Book(101, "Gone with the Wind");
        Bibliotica NewUserThree = new Bibliotica();
        Assert.assertEquals("Sorry! We don't have that book yet.", NewUserThree.ReserveABook(bookNo, books));
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
