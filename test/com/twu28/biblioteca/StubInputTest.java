import junit.framework.Assert;
import org.junit.Test;

import java.io.*;

public class StubInputTest {
    @Test
    public void getUserInputAs1() throws IOException {
        StubInput input=new StubInput();
        String userInput=input.getUserInput("1");
        Assert.assertEquals("1",userInput);
    }

    @Test
    public void getUserInputAsNikita() throws IOException {
        StubInput input=new StubInput();
        String userInput=input.getUserInput("nikita");
        Assert.assertEquals("nikita",userInput);
    }

}
