package Linked_demo;

public class testLinkedList {
    public static void main(String[] args) {
        LinkedList link = new LinkedList(10);
        link.addFirts(11);
        link.addFirts(12);
        link.addFirts(13);

//        link.printList();

        link.add(1,9);
        link.add(2,9);

        link.printList();
    }

}
