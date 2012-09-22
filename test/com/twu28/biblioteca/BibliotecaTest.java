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

}
