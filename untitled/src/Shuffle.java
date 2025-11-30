import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Червоний");
        colors.add("Синій");
        colors.add("Зелений");
        colors.add("Жовтий");
        colors.add("Чорний");

        System.out.println("Перед shuffle:");
        System.out.println(colors);

        Collections.shuffle(colors);

        System.out.println("Після shuffle:");
        System.out.println(colors);
    }
}
