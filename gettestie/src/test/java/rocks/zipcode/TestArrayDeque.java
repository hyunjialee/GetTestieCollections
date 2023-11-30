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

    }

    @Test
    public void testClear(){

    }


    @Test
    public void testContains(){

    }

    @Test
    public void testPeek(){

    }

    @Test
    public void testPoll(){

    }

    @Test
    public void testPop(){

    }
    //pop, peek, add, remove
}
