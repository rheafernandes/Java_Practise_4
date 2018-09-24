import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateALTest {
    UpdateAL objTest;
    @Before
    public void setUp() throws Exception {
        objTest=new UpdateAL();
    }

    @After
    public void tearDown() throws Exception {
        objTest=null;
    }

    @Test
    public void updateList() {
        String list="Apple, Grape, Melon, Berry";
        String[] replacement={"Kiwi","Mango"};
        int[] replaceIndex={0,2};
        ArrayList<String> expected=new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        ArrayList<String> actual=objTest.updateList(list,replacement,replaceIndex);
        assertEquals(expected,actual);
    }
}