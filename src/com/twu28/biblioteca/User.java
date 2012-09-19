public class User {
    private String name;
    public int noOfbooksReserved;
    public Book booksresrved[];

    User(){
        noOfbooksReserved=0;
    }

    public boolean reserve(Book book) {
        if(book.isAvailableForReservation()){
            System.out.println("Thank You..Enjoy the book");
            book.count--;
            //booksresrved[noOfbooksReserved] = new Book();
            //booksresrved[noOfbooksReserved]=book;
            return true;
        }
        else {
            System.out.println("Sorry we dont have the book yet");
            return false;
        }
    }

    public void setUserDetails() {
        name="TW User";

    }

    public void getUserDetails() {

        System.out.println(name);
        System.out.println("Contact The Librarian..Thank You!!!");
    }

}


