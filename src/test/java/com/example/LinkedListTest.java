package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testAdd() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);

        assertEquals(1, linkedList.head.value);
    }

    @Test
    public void testAddTwice() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);

        assertEquals(1, linkedList.head.value);
        assertEquals(2, linkedList.head.next.value);
    }
}
