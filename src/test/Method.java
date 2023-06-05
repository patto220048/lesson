package test;

public class Method {
    public static void main(String[] args) {
        int price = 1500;
        int point = 0;
        point = calculatePoint(price);
        System.out.println(point);

        point = calculatePoint(price, 0.05f);
        System.out.println(point);
    }

    public static int calculatePoint(int price) {
        float point = price * 0.03f;
        return (int) point;
    }

    public static int calculatePoint(int price, float rate) {
        float point = (float) price * rate;
        return (int) point;
    }

}
