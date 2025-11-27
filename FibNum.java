import java.util.Scanner;

class FibNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fibonacci series index no. ");
        int num = sc.nextInt();
        System.out.print("Fibonacci number at index " + num + " is " + fibo(num));
        sc.close();
    }
    
    // static int fibo(int n) {        // Optimal  TC: O(n)  SC: O(1)
    //     if (n == 0) return 0;
    //     if (n == 1) return 1;
    //     int prev1 = 0;
    //     int prev2 = 1;
    //     int temp;
    //     for (int i = 1; i < n; i++) {
    //         temp = prev1 + prev2;
    //         prev1 = prev2;
    //         prev2 = temp;
    //     }
    //     return prev2;
    // }
    
    static int fibo(int n) {      // TC: O(2ⁿ) exponential - 2 function calls in each iteration
        if (n <= 1) {             // SC: O(n)  At maximum there could be N function calls waiting in the recursion stack    
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);   // Recursion
    }
}
