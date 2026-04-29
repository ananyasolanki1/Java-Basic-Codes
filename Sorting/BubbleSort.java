import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 9, 42, 20, 56, 12};
        bubbleSort(arr);
    }
    
    static void bubbleSort(int[] arr) {             // swapped does TC: O(n) in best case, otherwise its TC: O(n²) in all case. SC: O(1) with or without swapped
        int n = arr.length;   // n = 6
        int temp;
        for (int i = 0; i < n - 1; i++) {           // After each pass, the largest unsorted element bubbles up to its correct position at the end
            boolean swapped = false;                // for each pass, resets the swapped to false
            for (int j = 0; j < n - 1 - i; j++) {   // compare till last elem, then till 2nd last, then till 3rd last....
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;                 // mark that a swap happened in this pass (array was not fully sorted), so checks next pass
                }
            }
            if (!swapped) {                          // if no swapped happened in a pass, means its sorted, so exit
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Interview Related - https://docs.google.com/document/d/1J2R8xPJWRub_vBej_LNoYt7bw3SzaYTxg_4T4CtAOmo/edit?usp=sharing
