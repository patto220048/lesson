package sample;

import java.util.Random;

import javax.swing.text.html.FormView;

public class Year {
    public static void main(String[] args) {
        float deposit = 1000000;
        float target  = 2000000;
        float interest = 0.01f;
        
        int year = 0;

        while(deposit < target) {
            deposit *= (1+ interest);
            year++;
        }
        System.out.println(year);
        //9x9
        int ans  = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                ans = i*j;
                System.out.print(ans + "");
            }
            System.out.println(" ");
        }
        //5x5
        Random rand = new Random();;
        String[] marks = {"o","x"};


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                int markIndex = rand.nextInt((marks.length));
                String result = "|" + marks[markIndex] ;
                System.out.print(result);
                
            }
            System.out.println("|");
        }
    }

    
}
