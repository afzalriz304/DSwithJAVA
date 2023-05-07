package BinarySearch.Basic;

public class NextGreatestCharacter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'g'}, 'c'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int[] charArray = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            charArray[i] = letters[i] - 'a';
        }
        int index = searchNextGreat(0, charArray.length - 1, charArray, target - 'a');
        return index > charArray.length - 1 ? letters[0] : letters[index];
    }

    private static int searchNextGreat(int start, int end, int[] charArray, int target) {
        int mid = (start + end) / 2;
        if (start > end)
            return start;

        if (charArray[mid] <= target)
            return searchNextGreat(mid + 1, end, charArray, target);
        else
            return searchNextGreat(start, mid - 1, charArray, target);
    }
}
