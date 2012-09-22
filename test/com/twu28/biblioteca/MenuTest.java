import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MenuTest {

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
    public void menuShouldBeDisplayed(){
        setTestParametersForConsoleOutput();
        Menu obj=new Menu();
        obj.showMenu();
        Assert.assertTrue(output.toString().trim()!="");
        System.setOut(originalout);
    }

    @Test
    public void cutomerShouldSelectOption() throws IOException {
        Assert.assertTrue(new Menu().chooseOption()!=0);
    }

    @Test
    public void customerShouldSelectValidOption(){
        Assert.assertTrue(new Menu().isValidOption());
    }

    @Test
    public void customerShouldBeNotifiedForInvalidOption() {
        setTestParametersForConsoleOutput();
        Menu obj=new Menu();
        obj.printInvalidMessage();
        Assert.assertEquals("Select a valid option",output.toString().trim());
        System.setOut(originalout);
    }



}

