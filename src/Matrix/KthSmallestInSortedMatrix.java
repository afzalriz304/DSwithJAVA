package Matrix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthSmallestInSortedMatrix {
    public static void main(String[] args) {
        int result = kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8);
        System.out.println(result);
    }

    private static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                queue.add(matrix[i][j]);
                if (queue.size() > k)
                    queue.poll();
            }
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }
}
