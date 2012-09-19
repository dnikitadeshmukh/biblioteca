public class Book{
    public static int count=10;
    private String bookName;
    private int edition;
    public User users[];
    public void setBookDetails(){

    }

    public void getBookDetails(){

    }

    public boolean isAvailableForReservation() {
        if(Book.count!=0)
            return true;
        return false;
    }
}
