import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Biblioteca {

    public int choice;
    public static int[] bookAvailabilty={2,5,0};

    public String startupMessage() {
        System.out.println("Welcome");
        return "Welcome";
    }

    public Boolean displayMenu() {
        System.out.println("MENU: \n1.Issue\n2.Submit\n3.CheckDetails\n4.Exit");
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void selectOption() throws IOException{
        BufferedReader option=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Choice:");
        choice=Integer.parseInt(option.readLine());

    }

    public boolean isValidOption(){
        if(choice>0 && choice<5){
            return true;
        }
        else{
            System.out.println("Select a Valid option");
            return false;
        }
    }



    public void viewBooks(){

        System.out.println("Books In The Library are as follows:\n1.Book1\n2.Book2\n3.Book3");
    }

    public boolean reserveBook() throws IOException {

        viewBooks();
        System.out.println("Choose the Book to be issued:");
        BufferedReader book=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Choice:");
        int bookno=Integer.parseInt(book.readLine())-1;
        if(isBookAvailable(bookno)){
            bookAvailabilty[bookno]--;
            System.out.println("Book Has Successfully been Reserved...THANKYOU Enjoy the book!!");
            return true;
        }
        else{
            System.out.println("Book Not available yet..!!");
            return false;
        }

    }

    public boolean isBookAvailable(int bookno){
        if(bookAvailabilty[bookno]>0)
            return true;
        else
            return false;
    }
}
class Application{
    public static void main(String args[]) throws IOException {
        Biblioteca app=new Biblioteca();
        app.startupMessage();
        app.displayMenu();
        app.selectOption();
        app.isValidOption();

        if(app.choice==1)
            app.reserveBook();
        else if(app.choice==3)
            System.out.println("Please talk to Librarian. Thank you.");
        else
            System.exit(1);
    }

}
