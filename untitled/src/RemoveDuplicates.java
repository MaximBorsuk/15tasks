import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Оригінальний список: " + numbers);

        HashSet<Integer> set = new HashSet<>(numbers);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("Список з дублікатами: " + uniqueList);
    }
}
