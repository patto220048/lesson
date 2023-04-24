package sample;

import java.util.Scanner;

public class CalculateAverrage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a janpanese:");
        int janpanese = scanner.nextInt();
        System.out.println("Input a mathmatic:");
        int mathmatic = scanner.nextInt();
        System.out.println("Input a social:");
        int social = scanner.nextInt();
        System.out.println("Input a science:");
        int science = scanner.nextInt();

        float avgTotal = (janpanese + mathmatic + social + science) / 4.0f;
        System.out.print("Average: " + avgTotal);
    }
}
