package TopicWise.GreedyAlgo;

import java.util.Arrays;

public class PreviousPermutation_1053 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 9, 4, 6, 7};
        System.out.println(Arrays.toString(prevPermOpt1(nums)));
    }

    public static int[] prevPermOpt1(int[] arr) {
        if (arr.length < 2)
            return arr;
        if (arr.length == 2) {
            if (arr[0] > arr[1])
                return arr;
            else
                return new int[]{arr[1], arr[0]};
        }
        //reverse track
        int j = arr.length - 1;
        while (j > 0) {
            if (arr[j - 1] > arr[j]) {
                int first = j - 1;
                int second = j;
                while (j < arr.length) {
                    if (arr[first] > arr[j]) {
                        if (arr[j] > arr[second]) {
                            second = j;
                        }
                    }
                    j++;
                }
                //swap
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                return arr;
            }
            j--;

        }
        return arr;
    }
}
