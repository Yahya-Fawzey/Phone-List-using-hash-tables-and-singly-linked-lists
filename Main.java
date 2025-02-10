public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        
        myList.addToHead(10);
        myList.addToHead(20);
        myList.printList();
        
        myList.addToTail(100);
        myList.addToTail(200);
        myList.printList();
        
        System.out.println("Searching for 100: " + myList.isInList(100));
        System.out.println("Deleted from Head: " + myList.deleteFromHead());
        myList.printList();
        
        System.out.println("Deleted from Tail: " + myList.deleteFromTail());
        myList.printList();
        
        System.out.println("Deleting Node 100:");
        myList.deleteNode(100);
        myList.printList();
        
        System.out.println("Searching for 100: " + myList.isInList(100));
    }
}
