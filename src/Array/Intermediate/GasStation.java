package Array.Intermediate;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        /*int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};*/
        /*int[] gas = new int[]{5, 1, 2, 3, 4};
        int[] cost = new int[]{4, 4, 1, 5, 1};*/
        /*int[] gas = new int[]{3,1,1};
        int[] cost = new int[]{1,2,2};*/
        System.out.println(canCompleteCircuit(gas, cost));
        System.out.println(canCompleteCircuitOptimal(gas, cost));
    }

    private static int canCompleteCircuitOptimal(int[] gas, int[] cost) {
        if (gas.length != cost.length)
            return -1;

        int gSum = Arrays.stream(gas).sum();
        int cSum = Arrays.stream(cost).sum();
        if(gSum<cSum)
            return -1;
        int total = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }
        return start;

    }


    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = -1;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] >= cost[i]) {
                int result = findCircuitIsPossible(i, i + 1, gas[i] - cost[i], gas, cost);
                if (result > 0)
                    return result;
            }
        }
        return start;
    }

    public static int findCircuitIsPossible(int start, int current, int left, int[] gas, int[] cost) {
        if (current == cost.length)
            current = 0;
        left += gas[current] - cost[current];
        if (left < 0)
            return -1;
        if (start == current)
            return start;
        return findCircuitIsPossible(start, current + 1, left, gas, cost);

    }
}
