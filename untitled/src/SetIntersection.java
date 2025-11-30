import java.util.*;

public class SetIntersectionExample {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9));

        List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);


        Set<Integer> intersection = findIntersection(sets);

        System.out.println("Перетин усіх множин: " + intersection);
    }

    public static <T> Set<T> findIntersection(List<Set<T>> sets) {
        if (sets == null || sets.isEmpty()) return new HashSet<>();

        Set<T> result = new HashSet<>(sets.get(0));

        for (int i = 1; i < sets.size(); i++) {
            result.retainAll(sets.get(i));
        }

        return result;
    }
}

