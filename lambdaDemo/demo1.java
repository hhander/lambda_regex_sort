package lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,5,6,4};
        Arrays.sort(arr,(a,b)-> a-b);
        System.out.println(Arrays.toString(arr));

    }

}
