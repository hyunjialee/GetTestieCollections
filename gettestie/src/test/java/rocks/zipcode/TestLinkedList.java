package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    LinkedList<Integer> linkedList;

    @Before
    public void setUp(){

        linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
    }

    @Test
    public void testAddAll(){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);

        linkedList.addAll(numbers);

        Assert.assertEquals(4, linkedList.size());

        // getFirst, getLast
    }

    @Test
    public void testFirst(){

        Integer expected = 1;
        Integer actual = linkedList.getFirst();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetLast(){

        Integer expected = 3;
        Integer actual = linkedList.getLast();

        Assert.assertEquals(expected, actual);

    }
}
