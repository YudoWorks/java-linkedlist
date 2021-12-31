package com.example;

public class LinkedList {
    Node head;

    public int add(int i) {
        Node node = new Node(i);
        if(head == null){
            head = node;
        }

        return node.value;
    }

    public LinkedList() {
    }

    public void pop() {
    }

    public void show() {
    }

}
