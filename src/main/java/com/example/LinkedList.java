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
        String linkedListShow = String.valueOf(head.value);
        
        head = head.next;
        while(head.next != null){
            linkedListShow += " - " + String.valueOf(head.value);
            head = head.next;
        }
        linkedListShow += " - " + String.valueOf(head.value);

        return linkedListShow;
    }

}
