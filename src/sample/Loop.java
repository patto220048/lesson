package sample;

import java.util.Arrays;
import java.util.Map;

public class Loop {
    public static void main(String[] args) {
        
        String[] drinks = {"コーヒー","お茶"};
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }
        for (String drink : drinks) {
            System.out.println(drink);
        }
        
        int i = 0; 
        while (i <= 10) {
            i++;
        }
        System.out.println(i);
    }
}
