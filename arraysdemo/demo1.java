package arraysdemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        People[] p = new People[2];
        p[0] = new People("张三",117);
        p[1] = new People("李四",18);
        System.out.println(p[0].toString());
        System.out.println(p[0].equals(p[1]));

        Comparator<People> c = (o1,o2)-> o1.age - o2.age;




        Arrays.sort(p, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return 0;
            }
        });
        System.out.println(Arrays.toString(p));


    }
}
