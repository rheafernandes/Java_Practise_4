import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NumberCountsTest {
    NumberCounts testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new NumberCounts();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void countNumberRepeat() {
        HashMap<String,Integer> actual=testObj.countNumberRepeat("one one -one___two,,three,one @three*one?two");
    }
}