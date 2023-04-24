package sample;

import java.util.Calendar;

public class Condision {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        String weekday = "";
        if (week == 2 ){
            weekday = "火"; 
        };
        String garbage = "";
        switch (weekday) {
            case "月":
                garbage = "燃えるゴミ";
                break;
            case "火":
                garbage = "燃えないゴミ";
                break;
        
            default:
                garbage = "回収なし";
                break;
        }
        System.out.println(garbage);
    }

}
