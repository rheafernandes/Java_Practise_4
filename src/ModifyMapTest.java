import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ModifyMapTest {
    ModifyMap testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new ModifyMap();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void modifyReturn() {
        String[] replacementKey={"val1"};
        String[] replaceKey={"val2"};
        HashMap<String,String> testMap=new HashMap<>();
        testMap.put("val1","mars");
        testMap.put("val2","jupiter");
        HashMap<String,String> expected=new HashMap<>();
        expected.put("val1","");
        expected.put("val2","mars");
        HashMap<String,String>actual=testObj.modifyReturn(testMap,replacementKey,replaceKey);
        assertEquals(expected,actual);
    }
}