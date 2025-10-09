public class FactRecursion {
    public static void main(String[] args) {
        // iterative approach
        int n = 4;
        // int fact = 1;
        // if (n > 0) {
        //     for (int i = 1; i <= n; i++) {
        //         fact *= i;
        //     }
        // }
        // System.out.println(fact);

        int fct = fact(n);
        System.out.println(fct);
    }

    // recursive approach
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
