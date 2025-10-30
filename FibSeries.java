// JAVA CODE FOR PRINTING FIBONACCI SERIES

import java.util.*;   

class FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in the Fibonacci series you want? ");
        int num = sc.nextInt();
        
        fibo(num);  // for Method 3
        
        // System.out.println(fibo(num)); // for Method 2
        
        // int[] narr = new int[num];  // for Method 1   (can directly write int[] narr = fibo(num);)
        // narr = fibo(num);
        // for (int i : narr) {
        //     System.out.println(i);
        // }
    }
    
    // static int[] fibo(int n) {        // Method 1: Creating int[] array
    //     int[] arr = new int[n];       // TC: O(n)  SC: O(n)
    //     int temp;
    //     int prev1 = 0;
    //     int prev2 = 1;
    //     for (int i = 0; i < n; i++) {     // storing fib nos in array
    //         arr[i] = prev1;
    //         temp = prev1 + prev2;
    //         prev1 = prev2;
    //         prev2 = temp;
    //     }
    //     return arr;
    // }
    
    // static ArrayList<Integer> fibo(int n) {     // Method 2  TC: O(n)  SC: O(n)
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     int temp;
    //     int prev1 = 0;
    //     int prev2 = 1;
    //     int i = 0;
    //     while (i < n) {
    //         arr.add(prev1);
    //         temp = prev1 + prev2;
    //         prev1 = prev2;
    //         prev2 = temp;
    //         i++;
    //     }
    //     // System.out.println(arr);
    //     return arr;
    // }
    
    static void fibo(int n) {       // Method 3: Directly printing the series  TC: O(n)  SC: O(1)
        int temp;
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(prev1);
            temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }
    }
}
