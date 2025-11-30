import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Джон");
        names.add("Аліса");
        names.add("Боб");
        names.add("Давид");

        System.out.println("Перед сортировкою:");
        System.out.println(names);

        Collections.sort(names);

        System.out.println("Після сортировки:");
        System.out.println(names);
    }
}

