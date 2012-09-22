public class BookBank {
    public String books[];
    public int bookCount[];
    BookBank(){
        books= new String[]{"Computer Networks by Tannenbaum", "Test Driven Development", "Data Structures by Sahani"};
        bookCount=new int[]{0,2,1};
    }
    public void display() {
        System.out.println("Books in Library are as follows:\n"+books[0]+"\n"+books[1]+"\n"+books[2]);
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
