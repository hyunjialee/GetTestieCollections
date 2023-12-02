package rocks.zipcode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class TestHashSet {
    HashSet<String> hashSet;


    @Before
    public void setUp(){
        String[] animals = {"dog", "cat", "fish", "owl", "wolf", "snake"};
        hashSet = new HashSet<>(Arrays.asList(animals));


    }
    @Test
    public void testAdd(){
        hashSet.add("john");

        Assert.assertEquals(7, hashSet.size());

    }


    @Test
    public void testContains(){

        Assert.assertTrue(hashSet.contains("dog"));

    }

    @Test
    public void testRemove(){
        hashSet.remove("dog");

        Assert.assertEquals(5, hashSet.size());

    }

    @Test
    public void testClone(){

        HashSet<String> map = (HashSet<String>) hashSet.clone();

        Assert.assertEquals(map, hashSet);

    }
}
