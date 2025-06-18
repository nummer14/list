import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Dragonfruit");

        Collections.sort(fruits);

        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}