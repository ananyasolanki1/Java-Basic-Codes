import java.util.ArrayList;
import java.util.Collections;

class Divisors {
    public static void main(String[] args) {
        int num = 15;
        // System.out.print("[");  // Brute force 1
        // divs(num);
        // System.out.print("]");
        
        // int[] narr = new int[num];   // Brure force 2
        // narr = divs(num);
        // for (int i = 0; i < num; i++) {
        //     if (narr[i] != 0) {
        //         System.out.println(narr[i]);
        //     }
        // }

        System.out.println(divs(num));   // Optimal  
    }
    
    // public static void divs(int n) {   // Brute force 1 - TC: O(n)  SC: O(d-divisors) directly printing the array
    //     int arr[] = new int[n];
    //     int cnt = 0;
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             arr[cnt] = i;
    //             cnt++;
    //         }
    //     }
    //     for (int i = 0; i < cnt; i++) {
    //         System.out.print(arr[i] + ", ");
    //     }
    // }
    
    // public static int[] divs(int n) {    // Brute force 2 - TC: O(n)  SC: O(d) returning the array
    //     int arr[] = new int[n];
    //     int cnt = 0;
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             arr[cnt++] = i;
    //         }
    //     }
    //     return arr;
    // }
    
    static ArrayList<Integer> divs(int n) {                 // optimal   TC: O(√n)   SC: O(d) checking till n sqr
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqn; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n/i) {
                    divisors.add(n/i);
                }
            }
        } 
        Collections.sort(divisors);
        return divisors; 
    }
    
}