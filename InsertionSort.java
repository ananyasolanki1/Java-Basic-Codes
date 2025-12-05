import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {14, 9, 6, 12, 4, 15};
        insertSort(arr);
    }
    
    // static void insertSort(int arr[]) {     // TC:  Worst: O(n²), Avg: O(n²), Best: O(n²) no early stop if array is sorted
    //     int n = arr.length;                 // SC: O(1)
    //     int temp;
    //     for (int i = 1; i < n; i++) {
    //         for (int j = i; j >= 1; j--) {
    //             if (arr[j] < arr[j - 1]) {
    //                 temp = arr[j];
    //                 arr[j] = arr[j - 1];
    //                 arr[j - 1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    
    // static void insertSort(int[] arr) {      // TC:  Worst: O(n²), Avg: O(n²), Best: O(n) as while fails if already sorted. More writes due to adjacent swaps
    //     int n = arr.length;                  // SC: O(1)
    //     int temp;
    //     int j;
    //     for (int i = 0; i < n; i++) {
    //         j = i;
    //         while (j > 0 && arr[j - 1] > arr[j]) {
    //             temp = arr[j - 1];
    //             arr[j - 1] = arr[j];
    //             arr[j] = temp;
    //             j--;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    
    static void insertSort(int[] arr) {           // TC:  Worst: O(n²), Avg: O(n²), Best: O(n), less writes as it just shifts and writes one final key
        int n = arr.length;                       // SC: O(1)
        int temp;                                 // Best and ideal one to use
        int j;
        int key;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
