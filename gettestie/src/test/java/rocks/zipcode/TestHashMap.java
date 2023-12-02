package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestHashMap {


    @Test
    public void testPut(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        map.size();
        Assert.assertEquals(3, map.size());
        Assert.assertNotNull(map);
    }

    @Test
    public void testKeySet(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        map.keySet();
        Set<Integer> expected1 = new HashSet<>();
        expected1.add(1);
        expected1.add(2);
        expected1.add(0);

        Assert.assertEquals(expected1, map.keySet());
    }
    // KeySet, Replace, isEmpty


    @Test
    public void testContainsKey(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        Assert.assertTrue(map.containsKey(1));


    }
    @Test
    public void testContainsValue(){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        Assert.assertTrue(map.containsValue("dogs"));

    }
    @Test
    public void testRemove(){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        map.remove(2, "john");

        Assert.assertEquals(2, map.size());


    }
    @Test
    public void testReplace(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        map.replace(2, "john", "chen");

        Assert.assertTrue(map.containsValue("chen"));

    }

    @Test
    public void testIsEmpty(){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "dogs");
        map.put(0, "cats");
        map.put(2, "john");

        Assert.assertFalse(map.isEmpty());


    }
}
