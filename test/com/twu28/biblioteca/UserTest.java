import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import junit.framework.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void talkToLibrarianMessageForCheckingCustomerDetails(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);

        User user =new User();
        user.getDetails();
        Assert.assertTrue(output.toString().trim().startsWith("Please Contact"));
        System.setOut(originalout);

    }

    @Test
    public void User1LogsInWithCorrectUserNameAndPassword() throws IOException {
        StartUpObject obj =new StartUpObject();
        obj.createUser(1);
        User user=new User();
        user.logIn();
        Assert.assertTrue(user.isLoginSuccesful());

    }

    @Test
    public void checkIfUserIsLoggedIn() throws IOException {
        StartUpObject obj =new StartUpObject();
        obj.createUser(1);
        User user=new User();
        user.logIn();
        user.isLoginSuccesful();
        Assert.assertTrue(user.isUserLoggedIn(StartUpObject.users[0]));
    }


}

