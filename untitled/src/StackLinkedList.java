import java.util.LinkedList;

public class LinkedListStack {
    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();

        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);

        System.out.println("Stack elements: " + stack);

        System.out.println("Top element (peek): " + stack.peekFirst());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.removeFirst());
        }
    }
}
