package Array.Advance;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    private static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int i = 0;
        int j = height.length - 1;
        int area;
        int max = 0;
        while (i < j) {
            area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, area);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}
