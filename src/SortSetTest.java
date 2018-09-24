import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void sortInput() {
        String input="Harry  Olive  Alice  Bluto  Eugene";
        String output="Alice Bluto Eugene Harry Olive";
        List<String> actual= Arrays.asList(output.split("[^A-Za-z]+"));
        assertEquals(actual,testObj.sortInput(input));
    }
}