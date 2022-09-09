package LinkedList;

public class LL {
    Node head;
    private int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }

        Node currentNode = head;
        
        while (currentNode != null) {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(4);
        list.addFirst(9);
        list.addFirst(6);
        list.printList();

        list.addLast(10);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        System.out.println("Deleting...");
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println("List size = "+list.getSize());
    }
}
