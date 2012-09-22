import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class CustomerTest {
    @Test
    public void talkToLibrarianMessageForCheckingCustomerDetails(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);

        Customer customer=new Customer();
        customer.getDetails();
        Assert.assertTrue(output.toString().trim().startsWith("Please Contact"));
        System.setOut(originalout);

    }
}