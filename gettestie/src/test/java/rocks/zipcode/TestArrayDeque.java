package rocks.zipcode;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void testDeque() {


        ArrayDeque<String> array = new ArrayDeque<>();
        int expected = 1;
        array.add("animal");
        int actual = array.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove(){
        ArrayDeque<String> array = new ArrayDeque<>();
        int expected = 1;
        array.add("animal");
        array.add("cat");
        array.remove("animal");

        int actual = array.size();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testClear(){
        ArrayDeque<String> array = new ArrayDeque<>();
        int expected = 0;
        array.add("animal");
        array.clear();

        Assert.assertEquals(expected, array.size());
    }


    @Test
    public void testContains(){
        ArrayDeque<String> array = new ArrayDeque<>();
        String expected = "dog";

        array.add("dog");

        Assert.assertTrue(array.contains("dog"));
    }

    @Test
    public void testPeek(){
        ArrayDeque<String> array = new ArrayDeque<>();

        array.add("dog");
        array.add("cat");
        array.add("fish");

        String expected = "dog";
        Assert.assertEquals(expected, array.peek());
    }

    @Test
    public void testPoll(){
        ArrayDeque<String> array = new ArrayDeque<>();

        array.add("dog");
        array.add("cat");
        array.add("fish");

        String expected = "cat";
        array.poll();
        Assert.assertEquals(expected, array.peek());

    }
    @Test
    public void testPop(){
        ArrayDeque<String> array = new ArrayDeque<>();

        array.add("dog");
        array.add("cat");
        array.add("fish");

        String expected = "fish";

        array.pop();
        array.pop();

        Assert.assertTrue(array.contains(expected));
    }
}
