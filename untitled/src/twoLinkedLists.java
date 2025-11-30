import java.util.LinkedList;

public class LinkedListEquality {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        if (list1.equals(list2)) {
            System.out.println("LinkedLists списки рівні.");
        } else {
            System.out.println("LinkedLists списки нерівні.");
        }
    }
}
