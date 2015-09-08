package Queue;

public class Node {
    Node next;
    Object data;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
