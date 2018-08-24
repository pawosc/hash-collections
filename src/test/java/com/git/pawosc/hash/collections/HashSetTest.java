package com.git.pawosc.hash.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashSetTest {

    private HashSet<String> set = new HashSet<>();

    @Before
    public  void setup(){
        set.add("ff");
        set.add("fww");
    }

    @Test
    public void setIsNotNull(){
        assertNotNull(set);
    }

    @Test
    public void isSizeisCorretly(){
        assertEquals(2,set.getSize());
    }



}