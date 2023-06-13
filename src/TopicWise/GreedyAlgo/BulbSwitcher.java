package TopicWise.GreedyAlgo;

import java.util.*;

/**
 * minimum number of cost require to switch all bulb
 * for each ith switch on(0->1) other right switch flips
 */
public class BulbSwitcher {
    public static void main(String[] args) {
        System.out.println(-3/2);
        System.out.println(3/2);
        System.out.println(0/1);
        System.out.println(0/10);
        System.out.println(9/10);
        System.out.println(bulbSwitch(new int[]{0, 1, 0, 1, 1, 0, 1, 1}));
        int result =0;
        String[] words1 = new String[10];
        String[] words2 = new String[10];
        HashMap<String,Integer> words1Map = new HashMap<String,Integer>();
        HashMap<String,Integer> words2Map = new HashMap<String,Integer>();
        for(int i=0;i<words1.length;i++){
            if(words1Map.containsKey(words1[i]))
                words1Map.put(words1[i],words1Map.get(words1[i])+1);
            else
                words1Map.put(words1[i],1);
        }
        for(int j=0;j<words2.length;j++){
            if(words2Map.containsKey(words2[j]))
                words2Map.put(words2[j],words2Map.get(words2[j])+1);
            else
                words2Map.put(words2[j],1);
        }
        for(int k=0;k<words1.length;k++){
            if(words2Map.containsKey(words1[k])
                    && words2Map.get(words1[k])==1
                    && words1Map.get(words1[k])==words2Map.get(words2[k])){
                result++;
            }
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersection = new HashSet();
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                intersection.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        int index=0;
        for(Integer element: intersection){
            result[index]=element;
            index++;
        }
        return result;
    }

    public static int bulbSwitch(int[] bulbs) {
        int cost = 0;
        for (int i = 0; i < bulbs.length; i++) {
            if (cost % 2 != 0) {
                if (bulbs[i] == 1)
                    cost++;
            } else {
                if (bulbs[i] == 0)
                    cost++;
            }
        }
        return cost;
    }
}
