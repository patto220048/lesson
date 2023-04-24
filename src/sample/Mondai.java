package sample;

public class mondai {
    public static void main(String[] args) {
        int age = 18;
        boolean hasBankaccount = false;
        boolean isBankList = false;
        String mess = "クレジットを作成出来ません";

        if (!isBankList && age >= 18 && age < 65) {
            if (hasBankaccount) {
                mess = "クレジットカードを出来ます";
            } else {
                mess = "必要！";
            }
        }
        System.out.println(mess);
    }
}
