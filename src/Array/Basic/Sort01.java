package Array.Basic;

import java.util.Arrays;

public class Sort01 {

    public static void main(String[] args) {
        int[] result = sortZeroesAndOne(new int[]{1, 1, 1, 0, 0, 1, 0, 1});
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int i = 0;
        int j = 0;
        int temp;
        while (j < arr.length) {
            if (arr[j] == 1) {
                j++;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        return arr;
    }

}

