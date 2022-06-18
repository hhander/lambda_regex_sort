package regex;

import java.util.Scanner;

public class demo2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        boolean flag = checkQQ(qq);
        System.out.println(flag);
    }


    public static boolean checkQQ(String qq)
    {
        return qq!=null&&qq.matches("[\\w&&[^_]]{}");
    }
}
