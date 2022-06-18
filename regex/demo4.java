package regex;

public class demo4 {
    public static void main(String[] args) {
        System.out.println(checkMoney("0+.3"));
    }
    public static boolean checkMoney(String money)
    {
        return money!=null&&money.matches("[\\d]+\\.?(\\d{0,})?");
    }
}
