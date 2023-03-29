package HomeWork29;

import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {

        TreeSet<String> countries=new TreeSet<>();
        countries.add("Afghanistan");
        countries.add("Iran");
        countries.add("Turkey");
        countries.add("Pakistan");
        countries.add("India");
        System.out.println(countries);
        for (String c:countries){
            System.out.println(c+ " ");
        }
    }
}
