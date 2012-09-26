import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class LoginTest {

    @Test
    public void startUpMessageShouldBeWelcome(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);
        Login obj=new Login();
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
        Login login =new Login();
        login.dispayLoginMessage();
        Assert.assertTrue(output.toString().trim().startsWith("Enter Login User Name and Password"));
        System.setOut(originalout);

    }

    @Test
    public void user1CreationSuccessfullyDone(){
        Login login =new Login();
        Assert.assertEquals("111-1111", login.createUser(1));

    }

    @Test
    public void user2CreationSuccessfullyDone(){
        Login login =new Login();
        Assert.assertEquals("111-1112", login.createUser(2));

    }

    @Test
    public void User1LogsInWithCorrectUserNameAndPassword(){
        Login login =new Login();
        login.createUser(1);
        login.acceptLoginDetails();
        Assert.assertTrue(login.isLoginSuccesful());

    }
}
