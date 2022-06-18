package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo5 {
    public static void main(String[] args) {
        String str = "小路a1sdsd蓉儿asjdadnja过儿";
       String[] arr = str.split("[\\w]");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Pattern p = Pattern.compile("[\\w&&[^_]]");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            System.out.println(m.group());
        }

    }
}
