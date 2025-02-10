public class SinglyLinkedList {
    private Node head;
    private Node tail;

    // Constructor for an empty list
    public SinglyLinkedList() {
        head = tail = null;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    // Adds a new node with the specified element to the head of the list
    public void addToHead(int element) {
        if (isEmpty()) {
            head = tail = new Node(element);
        } else {
            head = new Node(element, head);
        }
    }

    // Adds a new node with the specified element to the tail of the list
    public void addToTail(int element) {
        if (isEmpty()) {
            head = tail = new Node(element);
        } else {
            tail.next = new Node(element);
            tail = tail.next;
        }
    }

    // Deletes and returns the head node's element; returns 0 if the list is empty
    public int deleteFromHead() {
        if (isEmpty()) {
            return 0;
        } else {
            int element = head.info;
            if (head == tail) { // Only one node in the list
                head = tail = null;
            } else {
                head = head.next;
            }
            return element;
        }
    }

    // Deletes and returns the tail node's element; returns 0 if the list is empty
    public int deleteFromTail() {
        if (isEmpty()) {
            return 0;
        } else {
            int element = tail.info;
            if (head == tail) { // Only one node in the list
                head = tail = null;
            } else {
                Node temp;
                for (temp = head; temp.next != tail; temp = temp.next);
                tail = temp;
                tail.next = null;
            }
            return element;
        }
    }

    // Deletes the first occurrence of the specified element from the list
    public void deleteNode(int element) {
        if (!isEmpty()) {
            if (head == tail && head.info == element) { // Single node matches
                head = tail = null;
            } else if (head.info == element) { // Head node matches
                head = head.next;
            } else { // Element somewhere else in the list
                Node pred = head;
                Node temp = head.next;

                while (temp != null && temp.info != element) {
                    pred = temp;
                    temp = temp.next;
                }

                if (temp != null) { // Element found
                    pred.next = temp.next;
                    if (temp == tail) { // Update tail if needed
                        tail = pred;
                    }
                }
            }
        }
    }

    // Checks if a specified element exists in the list
    public boolean isInList(int element) {
        Node temp;
        for (temp = head; temp != null && temp.info != element; temp = temp.next);
        return (temp != null);
    }

    // Prints the elements of the list
    public void printList() {
        Node temp = head;
        System.out.println("The Singly Linked List is:");
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }
}
