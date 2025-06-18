import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);
        int sum = 0;
        for (int fruitprice : fruitPrices.values()){
            sum += fruitprice;
        }

        System.out.println("Sum of fruit price is: " + sum/fruitPrices.size());
    }
}