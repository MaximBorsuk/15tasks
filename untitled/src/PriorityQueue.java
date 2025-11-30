import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(42);
        pq.add(10);
        pq.add(7);
        pq.add(99);
        pq.add(35);

        System.out.println("Елементи в порядку сортування:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

