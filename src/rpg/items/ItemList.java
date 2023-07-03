package rpg.items;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemList {
    private static String CSV_PATH = "./src/data/item.csv";
    public ArrayList<Item> list = new ArrayList<>();
    public Map<Long, Item> items = new HashMap<>();
    public ItemList (){
        this.loadCsv();
        this.getList();
    }
    public void loadCsv(){
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffer;
        try {
            file = new FileInputStream(CSV_PATH);
            reader = new InputStreamReader(file, "UTF-8");
            buffer = new BufferedReader(reader);

            String line ;
            while ((line =  buffer.readLine()) != null){
                String[] data = line.split(",");  
                String name = data[1];
                ItemType type = ItemType.valueOf(data[2].toUpperCase());
                int price = Integer.parseInt(data[3]);
                int actackPower = Integer.parseInt(data[4]);
                int defencePower = Integer.parseInt(data[5]);
                Item item = new Item(name, actackPower, defencePower, price, type);
                list.add(item);
               
            };
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(CSV_PATH + ": " + e.getMessage() + "error: " + e.getStackTrace());
        }
        finally{
            System.out.println("DONE!");
        }

    } 
    public void getList(){
        System.out.println(list);
    }

}
