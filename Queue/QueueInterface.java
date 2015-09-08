package Queue;

import java.util.Iterator;

public interface QueueInterface {

    /**
     * current queue size
     */
    int size();

    /**
     * true if queue is empty
     */
    boolean isEmpty();

    /**
     * add element at end of queue
     */
    void enqueue(Object element);

    /**
     * return and remove first element.
     */
    Object dequeue();

    /**
     * return (without removing) first element
     */
    Object first();

    /**
     * return (without removing) last element
     */
    Object last();

    /**
     * return "true" if this queue contains the specified element
     *
     * @param o
     */
    boolean contains(Object o);

    /**
     * element iterator
     */
    Iterator iterator();

}
