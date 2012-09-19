import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

public class MenuTest {
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
}
