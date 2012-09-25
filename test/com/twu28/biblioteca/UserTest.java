import java.io.ByteArrayOutputStream;
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
    public void checkIfUserIsLoggedIn(){
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.createUser(1);
        biblioteca.login();
        biblioteca.isLoginSuccesful();
        Assert.assertTrue(biblioteca.users[0].logInStatus);
    }
}

