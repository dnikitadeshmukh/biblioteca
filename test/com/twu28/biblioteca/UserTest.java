import junit.framework.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void bookReservtionSuccessful() {
        Book book=new Book();
        Assert.assertTrue(new User().reserve(book));
    }
}
