package Linked_demo;

import javax.xml.soap.Node;

public class LinkedList {
    private Node head;
    private int numNodes;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;


        public Node(Object data) {
            this.data = data;
        }

        ;

//        public Object getData() {
//            return this.data;
//        }



        public Node get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

    }
    public void addFirts(Object data) {
        Node temp = head; // vị trí ban đầu(index 0)
        head = new Node(data);
        head.next = temp;
        numNodes++;

    }

    public void add(int index, Object data) {
        Node temp = head;
        Node hoder;
        for (int i = 0; i < index - 1 && temp != null; i++) {
             temp=temp.next;
        }
        hoder = temp.next; // noi lưu trữ tạm
        temp.next = new Node(data);
        temp.next.next = hoder;
        numNodes++;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}


