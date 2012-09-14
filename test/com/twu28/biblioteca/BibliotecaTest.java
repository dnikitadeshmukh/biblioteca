import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class BiblieotecaTests {
    @Test
    public void isAppStartupWelcome(){
        Assert.assertEquals("Welcome", new Biblioteca().startupMessage());
    }
}