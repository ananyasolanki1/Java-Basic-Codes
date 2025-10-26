import java.util.Arrays;
import java.util.Collections;

public class RevArray {
    public static void main(String[] args) {
        // int[] myarr = {10, 32, 6, 54, 245, 0, 6};
        Integer[] arr = {10, 32, 6, 54, 245, 0, 600}; 
        // reverse(myarr);
        // reverse(myarr, 0, myarr.length - 1);
        reverse(arr);

    }

    // static void reverse(int[] arr) {         // Method 1:  Brute Force   TC: O(n)   SC: O(n)
    //     int n = arr.length;
    //     int[] narr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         narr[n-i-1] = arr[i];
    //     }
    //     System.out.println(Arrays.toString(narr));

    // }


    // public static void reverse(int[] arr) {      // Method 2:   Brute Force   TC: O(n)    SC: O(n)
    //     int n = arr.length;                      // Almost same as Method 1
    //     int[] revarr = new int[n];
    //     int idx = n;
    //     for (int i = 0; i < n; i++) {
    //         revarr[i] = arr[idx - 1]; 
    //         idx--;
    //     }
    //     System.out.println(Arrays.toString(revarr));
    // }


    // public static void reverse(int[] arr) {         // Method 3:  space optimized  TC: O(n/2) => O(n)   SC: O(1)
    //     // int n = arr.length;                      // Without creating 2 pointers
    //     // int temp;
    //     // for (int i = 0; i < n/2; i++) {
    //     //     temp = arr[i];
    //     //     arr[i] = arr[n - 1 - i];
    //     //     arr[n - 1 - i] = temp;
    //     // }
    //     // System.out.println(Arrays.toString(arr));

    //     int n = arr.length;                      // Creating 2 pointers
    //     int p1 = 0;
    //     int p2 = n - 1;
    //     int temp;
    //     while (p1 < p2) {
    //         temp = arr[p1];
    //         arr[p1] = arr[p2];
    //         arr[p2] = temp;
    //         p1++;
    //         p2--;
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }


    // public static void reverse(int[] arr, int start, int end) {    // start and end indexes
    //     if (start >= end) {                                        // Method 4: Recursive method  TC: O(n)  SC: O(n)
    //         System.out.println(Arrays.toString(arr));
    //         return;
    //     }
    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    //     reverse(arr, start + 1, end - 1);

    //     // int temp;                                   // Above one is better, this one unnecessarily must use else if
    //     // if (start < end) {                          // TC: O(n)   SC: O(n)
    //     //     temp = arr[start];
    //     //     arr[start] = arr[end];
    //     //     arr[end] = temp;
    //     //     reverse(arr, ++start, --end);
    //     // }
    //     // else if (start >= end) {
    //     //     System.out.println(Arrays.toString(arr));
    //     // }
    // }

    
    public static void reverse(Integer[] arr) {             // Using library function 
        Collections.reverse(Arrays.asList(arr));            
        System.out.println(Arrays.toString(arr));
    }
    /**
    * Reverses an Integer array using library functions.
    * Arrays.asList(arr) creates a List view of the array (O(1) space),
    * Collections.reverse() swaps elements in-place (O(n) time, O(1) space),
    * System.out.println(Arrays.toString(arr)) creates a temporary string for printing (O(n) time and O(n) space).
    TC: O(n) - as it traverses the whole array for reversal
    SC: O(1) for reversal(no extra array used), O(n) if counting printing
    */
}
