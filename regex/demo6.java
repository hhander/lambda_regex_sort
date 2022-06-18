package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo6 {
    public static void main(String[] args) {
        String str = "来黑马学习Java,电话020-43422424，或者练习邮箱" + "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn,400-100-3233,4001003233";

        String regex = "[\\w]{1,30}@[\\w]{1,20}(\\.[a-zA-Z0-9]{2,}){1,2}|"
                + "1[3-9]{1}[\\d]{9}|" + "400-?[0-9]{3,8}-?[0-9]{3,8}" ;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while(m.find())
        {
            System.out.println(m.group());
        }


    }
}
