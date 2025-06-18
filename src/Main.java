import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Bbanana");
        fruits.add("Apple");
        fruits.add("Tomato");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Potato");
        fruits.add("Dragonfruit");

        fruits.remove("Tomato");
        fruits.remove(5);

        if(fruits.contains("Kiwi")) {
            System.out.println("Kiwi는 포함되어 있습니다.");
        }
    }
}