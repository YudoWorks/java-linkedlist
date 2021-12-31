package com.example;

public class LinkedList {
    Node head;

    public void add(int i) {
        Node node = new Node(i);
        if(head == null){
            head = node;
            return;
        }

        Node headCheckPoint = head;

        while (head.next != null) {
            head = head.next;
        }

        head.next = node;
        head = headCheckPoint;
    }

    public LinkedList() {
    }

    public int getLast() {
        if(head.next != null){
            head = head.next;
        }
        return head.value;
    }

    public void show() {
    }

}
