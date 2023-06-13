package TopicWise.SliddingWindow.FixedSize.Array;

public class MaxAvgOfK {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-1},1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int end = nums.length;
        double avg=Integer.MIN_VALUE;
        double sum=0;
        while(j<end){
            sum+=nums[j];
            if(i+j+1>k-1){
                avg = Math.max(avg,sum/k);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return avg;
    }
}
