import static org.junit.Assert.*;

public class OccurancesStringTest {
    OccurancesString testObj;
    @org.junit.Before


    @org.junit.After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @org.junit.Test
    public void checkOccurances() {
        testObj=new OccurancesString("Hello World");
        int expected=1;
        int actual=testObj.checkOccurances("World");
        assertEquals(expected,actual);
        testObj=new OccurancesString("Hello World");
        expected=1;
        actual=testObj.checkOccurances("W");
        assertEquals(expected,actual);
        testObj=new OccurancesString("This is me");
        expected=2;
        actual=testObj.checkOccurances("i");
        assertEquals(expected,actual);

    }
}