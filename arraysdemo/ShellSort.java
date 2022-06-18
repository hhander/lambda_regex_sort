package arraysdemo;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,5,6,8,7};
        int h = 1;
        while(h<arr.length/2)
        {
            h = 2*h + 1;
        }

        while(h>0)
        {
            for (int i = h; i < arr.length; i++) {

                for (int j = i; j >= h ; j-=h) {
                    if(arr[j] < arr[j - h])
                    {
                        int tmp = arr[j];
                        arr[j] = arr[j - h];
                        arr[j - h] = tmp;
                    }
                    else
                    {
                        break;
                    }
                }

            }
            h = h/2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
