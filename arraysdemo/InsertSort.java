package arraysdemo;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j-1]>arr[j])
                {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
