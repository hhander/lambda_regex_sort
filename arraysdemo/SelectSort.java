package arraysdemo;

import java.util.Arrays;
import java.util.Date;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2};
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[max] < arr[j])
                {
                    max = j;
                }
            }
            if(max!=i)
            {
                int tmp = arr[max];
                arr[max] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
