import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckTWoTest {
    CheckTWo testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new CheckTWo();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void checksIfTwoOrMore() {
        HashMap<String,Boolean> actual=testObj.checksIfTwoOrMore("a a b a a c c d e f a b");

    }
}