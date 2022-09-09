package LinkedList;

public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(4);
        list.addFirst(9);
        list.addFirst(6);
        list.printList();

        list.addLast(10);
        list.addFirst(1);
        list.printList();
    }
}
