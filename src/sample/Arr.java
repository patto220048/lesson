package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        String[] drinks = {"コーヒー","お茶"};
        System.out.println(Arrays.toString(drinks));
        
        System.out.println(drinks[1]);

        int[] prices = {200,300,400};

        System.out.println(prices);
        Random rd  = new Random();
        int numRd = rd.nextInt(3);

        final String[] hands = {"グー","チョキ","バー"};
        int handIndex = rd.nextInt(3);
        String botHand = hands[handIndex];
        System.out.println(botHand);
  

    }   
    
}
