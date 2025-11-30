import java.util.ArrayList;
import java.util.Collections;

class MaxFromArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(45);
        numbers.add(7);
        numbers.add(89);
        numbers.add(23);

        System.out.println("ArrayList: " + numbers);

        int max = Collections.max(numbers);

        System.out.println("Maximum element: " + max);
    }
}
