package sample;

public class ExceptionApp {
    public static void main(String[] args) {
        int score = 100;
        int count = 0;
        float avarge = 0;
        avarge  = caculateAverrage(score, count);
        System.out.println(avarge);

    }
    public static float  caculateAverrage(int score, int count) {
        if (count > 0) {

            return score/count;
        }
        else {
            System.out.println("error");
            return 0;
        }
    }
}
