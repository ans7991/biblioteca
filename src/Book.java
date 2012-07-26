import java.text.MessageFormat;

public class Book
{
    private int bookNo;
    private String bookName;
    Book(int bookNo, String bookName)
    {
        this.bookNo = bookNo;
        this.bookName = bookName;
    }
    public int getBookNo()
    {
        return this.bookNo;
    }
    public void displayBook()
    {
        System.out.println(MessageFormat.format("{0}  {1}", this.bookNo, this.bookName));
    }

    public String getBookName()
    {
        return this.bookName;
    }
}
