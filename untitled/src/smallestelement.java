import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(20);
        list.add(15);

        int k = 3;

        int result = kthSmallest(list, k);
        System.out.println(k + "rd smallest element is: " + result);
    }

    public static int kthSmallest(ArrayList<Integer> list, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);

        int element = -1;
        for (int i = 0; i < k; i++) {
            element = minHeap.poll();
        }

        return element;
    }
}

