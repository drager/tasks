package Queue;

import java.util.Iterator;

public class Queue implements QueueInterface, Iterable {
    Node head;
    Node tail;
    Object element;
    Integer size;

    public Queue(Object element) {
        head = new Node(element, null);
        tail = head;
        this.element = element;
        this.size = 1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void enqueue(Object element) {
        tail.next = new Node(element, null);
        tail = tail.next;
        this.size++;
    }

    @Override
    public Object dequeue() {
        Object tmp = this.first();
        head = head.next;
        this.size--;
        return tmp;
    }

    @Override
    public Object first() {
        return this.head.data;
    }

    @Override
    public Object last() {
        return this.tail.data;
    }

    @Override
    public boolean contains(Object o) {
        if (this.size == 1) {
            return this.head.data == o;
        }

        for (Object i : this) {
            if (i.equals(o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return new NodeIterator(head);
    }
}
