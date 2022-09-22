package Array;

import java.util.*;

public class TwoSum {
    static int target = 6;

    public static void main(String[] args) {
        // writing pair
        //int[] arr = new int[]{3, 2, 4};
        //Arrays.stream(solution1(arr)).forEach(System.out::println);
        // writing indexes
        int[] arr = new int[]{2,-3,3,3,-2};
        Arrays.stream(pairSum(arr,0)).forEach(System.out::println);

    }

    private static int[] solution1(int[] nums) {
        Arrays.sort(nums);
        return findPair(nums, 0, nums.length - 1);
    }

    private static int[] findPair(int[] nums, int i, int j) {
        if (nums[i] + nums[j] == target)
            return new int[]{nums[i], nums[j]};
        else if (nums[i] + nums[j] > target)
            i++;
        else
            j--;
        return findPair(nums, i, j);
    }

    private static int[] solution2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (Integer n : nums) {
            if (!map.isEmpty() && map.containsKey(n))
                return new int[]{map.get(n), index};
            else
                map.put(target - n, index);
            index++;
        }
        //map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
        return new int[]{};
    }
    public static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        ArrayList<int[]> list = new ArrayList<>();
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==s){
                list.add(new int[]{arr[i],arr[j]});
                j--;
            }else if(sum<s){
                i++;
            }else{
                j--;
            }
        }
        ;
        int[][] result = new int[list.size()][2];
        int index =0;
        for(int[] e:list){
            result[index][0] = Math.min(e[0],e[1]);
            result[index][1] = Math.max(e[0],e[1]);
            index++;
        }
        Arrays.sort(result,Comparator.comparing(num->num[0]));
        return result;
    }
}
