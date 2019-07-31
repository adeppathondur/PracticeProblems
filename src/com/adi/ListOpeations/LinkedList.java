package com.adi.ListOpeations;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            data = data;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data)
        new_node.next = null
        if (head.next == null) {
            list.head = new_node;
        } else
            Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return list;
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node current = list.head;
        Node prev = null;
        if (index == 0 && current != null) {
            list.head = current.next;
            System.out.println(index + " Starting position element deleted");
            return list;
        }
        int counter = 0;
        while (current != null) {
            if (counter == index) {
                prev.next = current.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = current;
                current = current.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
        return list;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

    }

}
