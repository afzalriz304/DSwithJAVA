package BinarySearch.Basic;

import java.util.Arrays;
import java.util.List;

public class Intermediate {
    public static void main(String[] args) {
        System.out.println(uniqueElement(Arrays.asList(1,2)));

        System.out.println(uniqueElement(Arrays.asList(1, 1, 2, 2, 3, 5, 5)));
        System.out.println(uniqueUsingMod(Arrays.asList(1, 1, 2, 2, 3, 5, 5)));
    }
    public static int uniqueUsingMod(List<Integer> arr) {
        int unique = 0;
        for (int i = 0; i < arr.size(); i++) {
            unique ^= arr.get(i);
        }
        return unique;
    }

    public static int uniqueElement(List<Integer> arr) {
        if (arr.isEmpty())
            return -1;
        if (arr.size() == 1)
            return arr.get(0);
        int start = 0;
        int last = arr.size() - 1;
        if (arr.get(start) != arr.get(start + 1))
            return arr.get(0);

        if (arr.get(last) != arr.get(last - 1))
            return arr.get(last);
        int unique = 0;
        for (int i = 0; i < arr.size(); i++) {
            unique ^= arr.get(i);
        }
        return unique;
    }

    private static int searchUsingBinarySearch(int start, int last, List<Integer> arr) {
        int mid = start + (last - start) / 2;
        if (arr.get(mid) != arr.get(mid - 1) && arr.get(mid) != arr.get(mid + 1))
            return arr.get(mid);
        if ((arr.get(mid) == arr.get(mid + 1) && mid % 2 == 0)
                || (arr.get(mid) == arr.get(mid - 1) || mid % 2 == 1)) {
            return searchUsingBinarySearch(mid + 1, last, arr);
        } else {
            return searchUsingBinarySearch(start, mid - 1, arr);
        }
    }

}
