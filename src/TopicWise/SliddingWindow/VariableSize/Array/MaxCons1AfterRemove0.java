package TopicWise.SliddingWindow.VariableSize.Array;

public class MaxCons1AfterRemove0 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int max = 0;
        int current =0;
        boolean visited = false;
        int i=0;
        int j=0;
        while (j<nums.length){
            if(nums[j]==1){
                current++;
                j++;
            }else {
                if(!visited){
                    visited=true;
                    j++;
                }else{
                    max=Math.max(max,current);
                    while (i<nums.length && visited){
                        if(nums[i]==1){
                            current--;
                        }else{
                            visited=false;
                        }
                        i++;
                    }
                }
            }
        }
        max=Math.max(max,current);
        return max;
    }
}
