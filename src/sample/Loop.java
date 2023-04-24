package sample;

import java.util.Map;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello " + i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(("("+i+","+j+")"));
            }
        }
    }
}
