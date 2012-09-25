import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import javax.sound.midi.SysexMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class BibliotecaTests{

    @Test
    public void startUpMessageShouldBeWelcome(){
        OutputStream output=new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(output);
        PrintStream originalout=System.out;
        System.setOut(printstream);
        Biblioteca obj=new Biblioteca();
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
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.dispayLoginMessage();
        Assert.assertTrue(output.toString().trim().startsWith("Enter Login User Name and Password"));
        System.setOut(originalout);

    }

    @Test
    public void user1CreationSuccessfullyDone(){
        Biblioteca biblioteca=new Biblioteca();
        Assert.assertEquals("111-1111",biblioteca.createUser(1));

    }

    @Test
    public void user2CreationSuccessfullyDone(){
        Biblioteca biblioteca=new Biblioteca();
        Assert.assertEquals("111-1112",biblioteca.createUser(2));

    }

    @Test
    public void User1LogsInWithCorrectUserNameAndPassword(){
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.createUser(1);
        biblioteca.login();
        Assert.assertTrue(biblioteca.isLoginSuccesful());

    }
}
