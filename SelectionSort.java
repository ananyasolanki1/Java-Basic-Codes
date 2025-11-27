import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {51, 42, 7, 2, 12, 21, 11};
        selectSort(arr);
    }

    static void selectSort(int[] arr) {     // TC: O(n²)  SC: O(1)
        int minIdx;
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {    // (n*(n-1))/2 comparisons total
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
