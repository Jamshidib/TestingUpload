package HomeWork29;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Seattle");
        cities.add("Portland");
        cities.add("Arlington");
        cities.add("Anaheim");
        cities.removeIf(a->a.startsWith("A"));
        System.out.println(cities);

    }
}
