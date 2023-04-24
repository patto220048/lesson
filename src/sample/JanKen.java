package sample;

import java.util.Random;
import java.util.Scanner;

public class JanKen {
    public static void main(String[] args) {
        final int ROCK = 0;
        final int SCISSORS = 1;
        final int PAPER = 2;

        String playerResult = "";
        String botResult = "";
        System.out.println("Enter you number 0-3 :");
        Scanner scr = new Scanner(System.in);
        int playerHand = scr.nextInt();
        
        Random random = new Random();
        int botHand = random.nextInt(3);
        if (playerHand == 1 ){
            playerResult  = "SCISSORS";
            
        }
        else if (playerHand == 2 ){
            playerResult  = "PAPER";
           
        }
        else if (playerHand == 3) {
            playerResult  = "ROCK";
           
        }


        System.out.println("Your Hand: " + playerResult);
        System.out.println("Bot Hand: " + botResult);
        int result = (playerHand - botHand + 3) % 3;
        String mess = "";
        if (result == 0) {
            mess = "Draw";

        } else if (result == 1) {
            mess = "You win!!";

        } else {
            mess = "Bot win!";
        }
        System.out.println(mess);
    }
}
