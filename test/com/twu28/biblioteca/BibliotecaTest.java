import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class BibliotecaTests{

    @Test
    public void startUpMessageWelcome(){
        Biblioteca obj=new Biblioteca();
        Assert.assertEquals("Welcome", obj.showStartupMsg());
    }
}
