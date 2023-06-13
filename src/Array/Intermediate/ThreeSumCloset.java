package Array.Intermediate;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSumCloset {
    public static void main(String[] args) {
        String s = "leetcode";
        for (int i=0;i<s.length();i++){
            s.charAt(i);
        }
        //int[] nums = new int[]{-1,2,1,-4};
        int[] nums = new int[]{1,1,1,0};
        System.out.println(threeSumCloset(nums,100));
    }

    public static int threeSumCloset(int[] nums, int target){
        if(nums.length<3)
            return 0;
        int result=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        int outerPointer=0;
        int end = nums.length-1;
        while(outerPointer<end-1){
            int i=outerPointer+1;
            int j=end;
            int sum =0;
            while(i<j){
                sum = nums[outerPointer]+nums[i]+nums[j];
                if(sum>target){
                    j--;
                }else{
                    i++;
                }
                if(Math.abs(result-target)>Math.abs(sum=target)){
                    result=target-sum;
                }
            }
            outerPointer++;
        }
        return result;
    }
}
