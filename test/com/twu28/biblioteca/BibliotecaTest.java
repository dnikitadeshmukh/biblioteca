import org.junit.Test;
import org.junit.Assert;
import java.io.IOException;

public class BiblieotecaTests {
    @Test
    public void isAppStartupWelcome(){
        Assert.assertEquals("Welcome", new Biblioteca().startupMessage());
    }

    @Test
    public void isMenuPresent(){
        Assert.assertEquals(true, new Biblioteca().displayMenu());
    }

    @Test
    public void validOptionShouldBe1or2or3() throws IOException {
        Assert.assertTrue(new Biblioteca().isValidOption());
    }

    @Test
    public void isReserved() throws IOException {
        Assert.assertEquals(true, new Biblioteca().reserveBook());
    }
}
