package TopicWise.GreedyAlgo;

import java.util.Arrays;

public class LargestPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4,1,5};
        System.out.println(Arrays.toString(convertLargestForKTimes(nums,3)));
    }

    private static int[] convertLargestForKTimes(int[] nums, int k) {
        int i=0;
        while (i<k){
            int j=i+1;
            int max = nums[i];
            int maxIndex=i;
            while (j<nums.length){
                if(nums[j]>max){
                    maxIndex=j;
                    max=nums[j];
                }
                j++;
            }
            //Swap i and maxIndex
            int temp = nums[i];
            nums[i]=nums[maxIndex];
            nums[maxIndex]=temp;
            i++;
        }
        return nums;
    }
}
