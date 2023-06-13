package TopicWise.GreedyAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{20, 12, 10, 15, 2};
        doSelectionSort(nums);
    }

    private static void doSelectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                // checks fo min
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            //swapping min with nums[i]
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
