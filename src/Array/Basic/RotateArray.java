package Array.Basic;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] result = rotate(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
