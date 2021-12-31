package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

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

    @Test
    public void testAddThrice() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(1, linkedList.head.value);
        assertEquals(2, linkedList.head.next.value);
        assertEquals(3, linkedList.head.next.next.value);
    }

    @Test
    public void testGetLastAddOnce() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);

        assertEquals(1, linkedList.getLast());
    }

    @Test
    public void testGetLastAddTwice() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);

        assertEquals(2, linkedList.getLast());
    }

    @Test
    public void testGetLastAddThrice() {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(3, linkedList.getLast());
    }
}
