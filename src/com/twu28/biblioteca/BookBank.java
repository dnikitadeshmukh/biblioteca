public class BookBank {
    public String books[];
    public int bookCount[];

    BookBank(){
        books= new String[]{"Computer Networks by Tannenbaum", "Test Driven Development", "Data Structures by Sahani"};
        bookCount=new int[]{0,2,1};
    }

    @Override
    public String toString() {
        String displayBooks="\"Books in Library are as follows:\n\n";
        for(int i=-0;i<books.length;i++){
            displayBooks=displayBooks.concat(books[i]+"\n");
        }
        return displayBooks;

    }

    public void displayBooks(Object book){
        System.out.println(book);
    }
    public boolean isAvailable(int index) {
        return (bookCount[index-1]>0);
    }

    public void displayUnavailableMessage() {
        System.out.println("Sorry we Dont have the book yet");

    }

    public void reserveBook(int index) {
        if(isAvailable(index))   {
            bookCount[index-1]--;
            System.out.println("Enjoy The Book");
        }
        else
            displayUnavailableMessage();
    }
}
