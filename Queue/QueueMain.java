package Queue;


public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue.first());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.last());

        System.out.println(queue.dequeue());

        System.out.println(queue.size());
        System.out.println(queue.contains(3));

        for (Object i : queue) {
            System.out.println(i);
        }
    }
}
