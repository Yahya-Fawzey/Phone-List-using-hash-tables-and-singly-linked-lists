public class Node {
    int info;
    Node next;

    // Constructors
    Node() {
        info = 0;
        next = null;
    }  

    Node(int element) {
        info = element;
        next = null;
    } 

    Node(int element, Node n) {
        info = element;
        next = n;
    } 
}
