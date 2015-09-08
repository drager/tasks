package Queue;

import java.util.Iterator;

public class NodeIterator implements Iterator {
    private Node node;

    public NodeIterator(Node head) {
        node = head;
    }

    public boolean hasNext() {
        return node != null;
    }

    public Object next() {
        Object nextData = node.data;
        node = node.next;

        return nextData;
    }
}
