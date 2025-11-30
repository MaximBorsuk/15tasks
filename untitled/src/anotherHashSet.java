import java.util.HashSet;
import java.util.Set;

public class HashSetSubsetExample {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);

        if (setA.containsAll(setB)) {
            System.out.println("setB є підмножиною setA.");
        } else {
            System.out.println("setB не є підмножиною setA.");
        }
    }
}

