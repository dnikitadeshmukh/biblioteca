import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BookBankTest {
    private OutputStream output;
    private PrintStream printstream;
    private PrintStream originalout;

    private void setTestParametersForConsoleOutput() {

        output=new ByteArrayOutputStream();
        printstream = new PrintStream(output);
        originalout=System.out;
        System.setOut(printstream);

    }

    @Test
    public void CustomerShouldViewAllBooksInLibrary(){
        setTestParametersForConsoleOutput();
        BookBank book=new BookBank();
        book.display();
        Assert.assertTrue(output.toString().trim().startsWith("Books"));
        System.setOut(originalout);
    }


    @Test
    public void diplayMessageIfBookNotAvailable(){
        setTestParametersForConsoleOutput();
        BookBank book=new BookBank();
        book.displayUnavailableMessage();
        Assert.assertTrue(output.toString().trim().startsWith("Sorry"));
        System.setOut(originalout);

    }

    @Test
    public void customerSelectsBook21AndMessageIsDisplayed(){
        setTestParametersForConsoleOutput();
        setTestParametersForConsoleOutput();
        BookBank bookBank =new BookBank();
        bookBank.reserveBook(2);
        Assert.assertTrue(output.toString().trim().startsWith("Enjoy"));
    }

    @Test
    public void customerSelectsBook31AndMessageIsDisplayed(){
        setTestParametersForConsoleOutput();
        setTestParametersForConsoleOutput();
        BookBank bookBank =new BookBank();
        bookBank.reserveBook(3);
        Assert.assertTrue(output.toString().trim().startsWith("Enjoy"));

    }

    @Test
    public void customerSelectsBook1AndItsNotAvailable(){
        setTestParametersForConsoleOutput();
        BookBank bookBank  =new BookBank();
        bookBank.reserveBook(1);
        Assert.assertTrue(output.toString().trim().startsWith("Sorry"));
        System.setOut(originalout);

    }




}

