import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryCheckTest {
    HarryCheck testObj;
    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void checkIfHarry() {
        testObj=new HarryCheck("Harry is present");
        Boolean expected=true;
        Boolean actual=testObj.checkIfHarry();
        assertEquals(expected,actual);
        testObj=new HarryCheck("No one is present");
        assertEquals(false,testObj.checkIfHarry());
    }
}