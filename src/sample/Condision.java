package sample;

public class Condision {
    public static void main(String[] args) {
        String weekday = "";
        String garbage = "";
        switch (weekday) {
            case "2":
                garbage = "Monday";
                break;
            case "3":
                garbage = "Tuesday";
                break;
            default:
                garbage = "None";
                break;
        }
        System.out.println(garbage);
    }

}
