package Array.Basic;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = moveZero(new int[]{0, 1, 0, 3, 12, 0});
        //System.out.println(Arrays.toString(nums));
        List<Integer> list = sortedArray(new int[]{-2, -1, 3}, new int[]{-6, -4, -1, 2, 3});
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;
        HashSet set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        while(i<m && j<n){
            if(a[i]<b[j]){
                if(set.add(a[i])){
                    list.add(a[i]);
                }
                i++;
            }else {
                if(set.add(b[j])){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<m){
            if(set.add(a[i])){
                list.add(a[i]);
            }
            i++;
        }
        while(j<n){
            if(set.add(b[j])){
                list.add(b[j]);
            }
            j++;
        }
        return new ArrayList<>(set);
    }
    private static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int temp;
        while (j < nums.length) {
            if (nums[j] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }

    private static int[] moveZero(int[] nums) {
        int i = nums.length - 1;
        int j = nums.length - 1;
        while (i >= 0) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            i--;
        }
        return nums;
    }
}
