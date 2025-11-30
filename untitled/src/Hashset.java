import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Яблуко");
        fruits.add("Банан");
        fruits.add("Манго");
        fruits.add("Апельсин");
        fruits.add("Банан");

        System.out.println("Елементи в HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

