
import java.util.Arrays;
import java.util.Collections;

public class RevArray {
    public static void main(String[] args) {
        // int[] myarr = {10, 32, 6, 54, 245, 0, 6};
        Integer arr[] = {10, 32, 6, 54, 245, 0, 600}; 
        reverse(arr);
        // reverse(myarr, 0, myarr.length - 1);

    }

    // // time compx: O(n)    space compx: O(n)
    // public static void reverse(int[] arr) {
    //     int n = arr.length;
    //     int[] revarr = new int[n];
    //     int idx = n;
    //     for (int i = 0; i < n; i++) {
    //         revarr[i] = arr[idx - 1]; 
    //         idx--;
    //     }
    //     System.out.println(Arrays.toString(revarr));
    // }


    // // space optimized O(1)  time compx: O(n/2) => O(n)
    // public static void reverse(int[] arr) {
    //     int n = arr.length;
    //     int temp;
    //     for (int i = 0; i < n/2; i++) {
    //         temp = arr[i];
    //         arr[i] = arr[n - 1 - i];
    //         arr[n - 1 - i] = temp;
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // // Recursive method
    // public static void reverse(int[] arr, int start, int end) {     // start and end indexes
    //     if (start >= end) {
    //         System.out.println(Arrays.toString(arr));
    //         return;
    //     }
    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    //     reverse(arr, start + 1, end - 1);
    // }

    // Using library function - 
    public static void reverse(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
