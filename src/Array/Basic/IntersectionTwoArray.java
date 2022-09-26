package Array.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> intersect = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersect.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        if (intersect.isEmpty())
            return new int[]{};

        int[] result = new int[intersect.size()];
        for (int q = 0; q < intersect.size(); q++) {
            result[q] = intersect.get(q);
        }
        return result;
    }
}
