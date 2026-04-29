import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {51, 42, 7, 2, 12, 21, 11};
        selectSort(arr);
    }

    static void selectSort(int[] arr) { // TC: O(n²) SC: O(1)
        int minIdx;
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) { // this is just the number of rounds/times it will compare the whole array.
                                          // highest comes at end in n-1 rounds
            minIdx = i;
            for (int j = i + 1; j < n; j++) { // (n*(n-1))/2 comparisons total
                if (arr[j] < arr[minIdx]) { // THIS IS COMPARISON
                    minIdx = j;
                }
            }
            // if (minIdx != 1) { // use this to optimize to avoid unnecessary swaps in each
            // pass
            temp = arr[i]; // THIS IS SWAP
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            // }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Selection sort selects the smallest in array and swaps with the initial ele
// (actaul place of small)
// Interview Related -
// https://docs.google.com/document/d/1Th6uI6uTg1W6rNqGWZR_eyAkQ4hzkRRElbAfktZXWis/edit?usp=sharing