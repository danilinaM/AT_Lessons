package alfa.lesson13;

import java.util.LinkedList;

public class AssaultQueue {

    private LinkedList<String> queue;

    public AssaultQueue(LinkedList<String> queue) {
        this.queue = queue;
    }

    protected void addRecruit(String name) {
        queue.addLast(name);
    }

    protected String retreatCoward() {
        String first = queue.getFirst();
        queue.removeFirst();
        return first;
    }

    protected void printQueue() {
        System.out.println(queue);
    }

    @Override
    public String toString() {
        return "Очередь: " + queue.toString();

    }
}
