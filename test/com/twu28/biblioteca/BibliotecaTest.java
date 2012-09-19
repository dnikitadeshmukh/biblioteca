import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class BibliotecaTest{

    @Test
    public void startUpMessageWelcome(){
        Biblioteca obj=new Biblioteca();
        Assert.assertEquals("Welcome", obj.showStartupMsg());
    }

    @Test
    public void menushowed(){
        Assert.assertTrue(new Menu().showMenu());
    }

    @Test
    public void isOptionSelected() throws IOException {
        Assert.assertEquals(1,new Menu().chooseOption());
    }

    @Test
    public void checkIfOptionValid(){
        Assert.assertTrue(new Menu().isValidOption());
    }

    @Test
    public void bookReservtionSuccessful() {
        Book book=new Book();
        Assert.assertTrue(new User().reserve(book));
    }
}
