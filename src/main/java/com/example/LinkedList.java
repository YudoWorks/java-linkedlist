package com.example;

public class LinkedList {
    Node head;

    public void add(int i) {
        Node node = new Node(i);
        if(head == null){
            head = node;
        }

        head.next = node;
    }

    public LinkedList() {
    }

    public void pop() {
    }

    public void show() {
    }

}
