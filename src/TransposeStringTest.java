import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString testObj;
    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void transposeAString() {
        testObj=new TransposeString("What a wonderful name it is");
        String expected="tahW a lufrednow eman ti si";
        String actual=testObj.transposeAString();
        assertEquals(expected,actual);
    }
}