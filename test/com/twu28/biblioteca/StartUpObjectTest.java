import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class StartUpObjectTest {
    @Test
    public void startUpMessageShouldBeWelcome(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);
        StartUpObject obj=new StartUpObject();
        obj.showStartupMsg();
        Assert.assertEquals("Welcome", output.toString().trim());
        System.setOut(originalout);
    }

    @Test
    public void loginMessageShouldBeDisplayed(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);
        StartUpObject obj =new StartUpObject();
        obj.dispayLoginMessage();
        Assert.assertTrue(output.toString().trim().startsWith("Enter Login User Name and Password"));
        System.setOut(originalout);

    }

    @Test
    public void user1CreationSuccessfullyDone(){
        StartUpObject obj =new StartUpObject();
        Assert.assertEquals("111-1111", obj.createUser(1));

    }

    @Test
    public void user2CreationSuccessfullyDone(){
        StartUpObject obj =new StartUpObject();
        Assert.assertEquals("111-1112", obj.createUser(2));

    }


}
