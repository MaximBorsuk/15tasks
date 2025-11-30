import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("Елементи в порядку сортування:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
    }
}
