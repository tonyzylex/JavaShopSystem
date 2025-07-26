import java.util.HashMap;

public class Shop {
    HashMap<String, HashMap<String, Integer>> ShopList = new HashMap<>();
    HashMap<String, Integer> Fruits = new HashMap<>();

    public Shop() {
        Fruits.put("Apple", 10);
        Fruits.put("Banana", 5);
        Fruits.put("Orange", 8);
        Fruits.put("Grapes", 12);
        Fruits.put("Mango", 15);
        Fruits.put("Pineapple", 20);
        Fruits.put("Strawberry", 18);
        Fruits.put("Watermelon", 25);
        Fruits.put("MYthicalFruit", 1500);
        ShopList.put("Fruits", Fruits);
    }
    
}
