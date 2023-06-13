package Array.Intermediate;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateSortArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(removeDuplicatesOptimal(new int[]{0, 0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    private static int removeDuplicatesOptimal(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int i = 2;
        int j = 2;
        while (j < nums.length) {
            if (nums[j] == nums[i - 2])
                j++;
            else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int result = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (set1.add(temp)) {
                result++;
            } else if (set2.add(temp)) {
                result++;
            }

        }
        nums = new int[result];

        int index = 0;
        for (Integer s1 : set1) {
            nums[index] = s1;
            index++;
        }
        for (Integer s2 : set2) {
            nums[index] = s2;
            index++;
        }

        Arrays.sort(nums);
        return result;
    }
}
