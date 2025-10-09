public class SumRecursion {
    public static void main(String[] args) {
        int s = sum(6, 0);
        System.out.println(s);
    }

    // public static int sum(int n) {
    //     // // Using Loop or formula: n(n+1)/2
    //     // int sm = 0;
    //     // for (int i = 1; i <= n; i++) {
    //     //     sm += i;
    //     // }
    //     // return sm;


    //     // // using recursion - 
    //     // if (n == 1) {
    //     //     return 1;
    //     // }
    //     // return n + sum(n - 1);
    // }

    // using recursion - parameterized way
    public static int sum(int n, int s) {
        if (n < 1) {
            return s;
        }
        return sum(n - 1, s + n);
    }
}
