package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        //System.out.println(SortedArrays(new int[]{1,2,3,0,0},new int[]{4,5},3,2));
        optimalSolution(new int[]{4,5,6,0,0,0},new int[]{1,2,3},3,3);

    }
    private static int[] SortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int i=0;
        int j=0;
        int[] arr =new int[m+n+1];
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    private static void optimalSolution(int[] nums1,int[] nums2,int m, int n){
        int i=0;
        int j=0;
        int k=0;
        while(m>0 && n>0 && i<m){
            if(nums1[i]<=nums2[j]){
                nums1[k]=nums1[i];
                i++;
            }else{
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            k++;
        }

        while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
    }
}
