import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar testObj;

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void replaceChar() {
        testObj=new ReplaceChar("dog");
        String expected="fog";
        String actual=testObj.replaceChar();
        assertEquals(expected,actual);
        testObj=new ReplaceChar("Doll drill");
        expected="fott fritt";
        actual=testObj.replaceChar();
        assertEquals(expected,actual);
    }
}