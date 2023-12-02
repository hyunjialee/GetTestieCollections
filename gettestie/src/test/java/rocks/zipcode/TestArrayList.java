package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void testAdd(){
        ArrayList<String> array = new ArrayList<>();

        array.add("dog");

        Assert.assertNotNull(array);

        // remove, clear
    }

    @Test
    public void testRemove(){
        ArrayList<String> array = new ArrayList<>();

        array.add("Dog");
        array.add("cat");
        array.remove("cat");

        int expected = 1;
        int actual = array.size();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testIndexOf(){
        ArrayList<String> array = new ArrayList<>();

        array.add("dog");
        array.add("cat");

        int expected = 1;

        Assert.assertEquals(expected, array.indexOf("cat"));

    }

    @Test
    public void testGet(){
        ArrayList<String> array = new ArrayList<>();

        array.add("dog");
        array.add("john");

        String actual = array.get(1);
        String expected = "john";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testClear(){
        ArrayList<String> array = new ArrayList<>();

        array.add("dog");
        array.add("john");

        int expected = 0;
        array.clear();

        Assert.assertEquals(expected, array.size());
    }

    @Test
    public void testIsEmpty(){
        ArrayList<String> array = new ArrayList<>();

        Assert.assertTrue(array.isEmpty());
    }
}
