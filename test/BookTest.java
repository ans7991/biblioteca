import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BookTest {

    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    String separator = System.getProperty("line.separator");

    @Test
    public void testGetBookNo() throws Exception
    {
        Book book = new Book(111, "Head First Java");
        Assert.assertEquals(111, book.getBookNo());
    }

    @Test
    public void testGetBookName() throws Exception
    {
        Book book = new Book(126, "Head First Java");
        Assert.assertEquals("Head First Java", book.getBookName());
    }

    @Test
    public void testDisplayBook() throws Exception
    {
        System.setOut(ps);
        Book book = new Book(123, "Gulliver Travels");
        book.displayBook();
        String expectedResult = "123  Gulliver Travels" + separator;
        Assert.assertEquals(expectedResult, os.toString());
    }
}
