package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testAdd() {
        LinkedList linkedList = new LinkedList();

        assertEquals(1, linkedList.add(1));
    }
}
