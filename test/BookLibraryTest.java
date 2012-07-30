import junit.framework.Assert;
import org.junit.Test;

public class BookLibraryTest {

    @Test
    public void testReserveABookWithBookFound() throws Exception {
        int bookNo = 101;
        BookLibrary bookLibrary = new BookLibrary();
        Assert.assertEquals("Thank You! Enjoy the Book.", bookLibrary.reserveABook(bookNo));
    }

    @Test
    public void testReserveABookWithBookNotFound() throws Exception {
        int bookNo = 112;
        BookLibrary bookLibrary = new BookLibrary();
        Assert.assertEquals("Sorry! We don't have that book yet.", bookLibrary.reserveABook(bookNo));
    }
}
