import java.util.ArrayList;

public class Book extends Item  {
    private String bookName;
    private String bookGenre;
    private boolean isCheckedOut;

    public Book(int itemID, String itemAisle, String bookName, String bookGenre, boolean isCheckedOut){
        super(itemID, itemAisle);
        this.bookName = bookName;
        this.bookGenre = bookGenre;
        this.isCheckedOut = isCheckedOut;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public String toString() {
        return "Book{" + "ID: " + getItemID() + " " + "Aisle: " + getItemAisle() + " " +
                "Name=" + bookName + '\'' +
                ", Genre=" + bookGenre + '\'' +  "Status: " + " " + (isCheckedOut ? "OUT" : "IN");
    }







}
