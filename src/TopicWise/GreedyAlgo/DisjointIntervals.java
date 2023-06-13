package TopicWise.GreedyAlgo;

import java.util.Arrays;

public class DisjointIntervals {
    public static void main(String[] args) {
//        int[][] intervals = new int[][]{{1,2},{4,6},{2,10}};
//        int[][] intervals = new int[][]{{1,2},{2,3},{3,4},{1,3}};
        //int[][] intervals = new int[][]{{1,2},{2,3}};
        int[][] intervals = new int[][]{{1, 100}, {1, 11}, {11, 22}, {2, 12}};
        //int[][] intervals = new int[][]{{1,2},{1,2},{1,2}};
        System.out.println(intervalPossible(intervals));
    }

    public static int intervalPossible(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int output = 0;
        int prevJ = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            if (prevJ >= intervals[i][1]) {
                prevJ = intervals[i][1];
                output++;
            } else if (prevJ <= intervals[i][0]) {
                prevJ = intervals[i][1];
            } else {
                output++;
            }
        }
        return output;
    }
}
