package reborn.Array.Extras;

import java.util.Arrays;

public class E2_MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] nums0 = new int[]{1, 3, 5, 7};
        int[] nums1 = new int[]{0, 2, 6, 8, 9};
        mergedTwoSortedArray(nums0, nums1);
    }

    private static void mergedTwoSortedArray(int[] nums0, int[] nums1) {
        int i = nums0.length - 1;
        int j = 0;
        while (nums0[i] > nums1[j]) {
            int temp = nums0[i];
            nums0[i] = nums1[j];
            nums1[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(nums0);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums0) + Arrays.toString(nums1));
    }

}
