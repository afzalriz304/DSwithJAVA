package reborn.Array.Extras;

import java.util.ArrayList;

public class E1_IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums0 = new int[]{1, 2, 3, 4, 5};
        int[] nums1 = new int[]{3, 4};
        System.out.println(intersection(nums0, nums1));
    }

    private static ArrayList<Integer> intersection(int[] nums0, int[] nums1) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums0.length && j < nums1.length) {
            if (nums0[i] == nums1[j]) {
                list.add(nums0[i]);
                i++;
                j++;
            } else if (nums0[i] > nums1[j]) {
                j++;
            } else {
                i++;
            }
        }
        return list;
    }
}
