import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Стек елементів: " + stack);

        System.out.println("Верхній елемент  (peek): " + stack.peek());

        System.out.println("Вискакуючі елементи:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
