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
        while(head.next != null){
            head = head.next;
        }
        
        return head.value;
    }

    public String show() {
        return String.valueOf(head.value) + " - " + String.valueOf(head.next.value) + " - " + String.valueOf(head.next.next.value);
    }

}
