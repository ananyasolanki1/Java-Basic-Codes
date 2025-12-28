import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 4, 3, 2, 1};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    // TC: O(n log n) — array is divided into log n levels and all n elements are merged at each level
    // SC: O(n) — extra temporary array used during merging (recursion stack is smaller)

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);   // divide
        mergeSort(arr, mid + 1, high);
        mergeArr(arr, low, mid, high);  // merge (conquer)
    }

    static void mergeArr(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();   // temporary array
        int left = low;
        int right = mid + 1;
        while ((left <= mid) && (right <= high)) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else if (arr[right] <= arr[left]) {
                temp.add(arr[right]);
                right++;
            }
        }
        if (left > mid) {               // if first half/left part of the array is compared,
            while (right <= high) {     // add remaining sorted elements of right part to the temp array
                temp.add(arr[right]);
                right++;
            }
        }
        else if (right > high) {        // if second half/right part of the array is compared,
            while (left <= mid) {       // add remaining sorted elements of left part to the temp array 
                temp.add(arr[left]);
                left++;
            }
        }
        for (int i = 0; i < temp.size(); i++) {     
            arr[low + i] = temp.get(i);             // Array: {4  1  [1   2   3   4]  2  1}  -> use (low + i) to copy merged subarray back to original position
        }
    }
}
