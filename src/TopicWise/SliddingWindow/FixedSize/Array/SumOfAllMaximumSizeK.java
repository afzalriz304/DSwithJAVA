package TopicWise.SliddingWindow.FixedSize.Array;

import java.util.*;

public class SumOfAllMaximumSizeK {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,2,-3,3,6,7};
        //System.out.println(sumOfAllMaxiumInArrayOfSizeK(nums,3));
        Deque<Integer> deque = new ArrayDeque<>();
        for(Integer i :nums){
            deque.offer(i);
        }
        for (Integer dq:deque){
            System.out.println(dq);
        }
    }

    private static int sumOfAllMaxiumInArrayOfSizeK(int[] nums, int k) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int i =0;
        int j =0;
        int len = nums.length;
        while(j<len){
            queue.add(nums[j]);
            if(j-i+1<k)
                j++;
            else{
                list.add(queue.peek());
                if(queue.contains(nums[i]))
                    queue.remove(nums[i]);
                i++;
                j++;
            }
        }
        for(Integer max:list){
            System.out.println(max);
            result+=max;
        }
        return result;
    }

}
