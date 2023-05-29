package shop;

import java.util.HashMap;
import java.util.Map;

public class FoodList {
    public static void main(String[] args) {
        Map<String, Food> foodList = new HashMap<String, Food>();
        foodList.put("F0001",new Food("Apple"));
        foodList.put("F0002",new Food("Peach"));
        foodList.put("F0003",new Food("Grape"));
      
    
       
        for (String i : foodList.keySet()) {
            System.out.println(i + foodList.get(i).name);
        }
          
        Food selectFood = foodList.get("F0002");
        System.out.println(selectFood.name);

    }
}
