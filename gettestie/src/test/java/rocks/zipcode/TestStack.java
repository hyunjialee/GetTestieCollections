package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    //Pop, push, peak, and isEmpty methods

    @Test
    public void testPop(){

    }

    @Test
    public void testPush(){

    }

    @Test
    public void testPeak(){

    }
    @Test
    public void testIsEmpty(){

    }
}
