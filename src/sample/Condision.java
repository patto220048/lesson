package sample;

import java.util.Calendar;
import java.util.Random;

public class Condision {
    public static void main(String[] args) {
        // Calendar cal = Calendar.getInstance();
        // int week = cal.get(Calendar.DAY_OF_WEEK);
        String[] week= {"月","火","水","木","金"};
        Random rd = new Random();
        int indexWeek = rd.nextInt(5);
        String weekday = week[indexWeek];
        System.out.println(weekday);
        String garbage = "";
        switch (weekday) {
            case "月":
                garbage = "燃えるゴミ";
                break;
            case "火":
                garbage = "燃えないゴミ";
                break;
            case "水":
                garbage = "回収なし";
                break;
            case "木":
                garbage = "燃えるゴミ";
                break;
            case "金":
                garbage = "びんーかん";
                break;
                
            default:
                garbage = "回収なし";
                break;
        }
        System.out.println(garbage);
    }

}
