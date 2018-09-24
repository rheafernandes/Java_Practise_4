import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class AscendingStringTest {
    AscendingString testObj;
    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void checkAscending() {
        testObj=new AscendingString("this is my life");
        String[] expected={"is","life","my","this"};
        String[] actual=testObj.checkAscending();
        assertEquals(expected,actual);
        testObj=new AscendingString("kid eats kitkat");
        expected=new String[]{"eats","kid","kitkat"};
        actual=testObj.checkAscending();
        assertEquals(expected,actual);
    }
}