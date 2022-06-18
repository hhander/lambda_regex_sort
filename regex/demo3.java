package regex;

public class demo3 {
    public static void main(String[] args) {
        System.out.println(checkEmail("1344567891"));
    }

    public static boolean checkEmail(String phoneNum)
    {
        return phoneNum!=null && phoneNum.matches("[\\d]{9,10}@[.]{6,10}]");
    }
}
