public class GCDfinder {

    // ----------------------------------------------------------------------
    // 🧮 METHOD 1A: Brute Force (1 → min(n1, n2))
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(min(n1, n2))
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: Iterate upward from 1 to the smaller number,
    //           storing the last common divisor.
    // ----------------------------------------------------------------------
    public static int GCD_BruteForce_Up(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // ----------------------------------------------------------------------
    // 🧮 METHOD 1B: Brute Force (min → 1)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(min(n1, n2))
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: Iterate downward from min(n1, n2) to 1,
    //           and return the first common divisor found.
    // ----------------------------------------------------------------------
    public static int GCD_BruteForce_Down(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // ----------------------------------------------------------------------
    // ⚙️ METHOD 2A: Euclidean Algorithm (Subtraction Based)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(max(n1, n2)) in worst case
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: Keep subtracting smaller number from larger
    //           until both become equal.
    // ----------------------------------------------------------------------
    public static int GCD_Subtraction(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }

    // ----------------------------------------------------------------------
    // ⚙️ METHOD 2B: Euclidean Algorithm (Subtraction + gcd variable)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(max(n1, n2))
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: Same as above, but explicitly maintains gcd variable.
    // ----------------------------------------------------------------------
    public static int GCD_Subtraction_WithVar(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        int gcd = 1;

        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 -= n2;
                gcd = n2;
            } else {
                n2 -= n1;
                gcd = n1;
            }
        }
        return gcd;
    }

    // ----------------------------------------------------------------------
    // ⚡ METHOD 3A: Euclidean Algorithm (Modulo Direct - if-else returns)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(log(min(n1, n2)))
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: At each step, replace larger number with remainder.
    // ----------------------------------------------------------------------
    public static int GCD_Modulo_Simple(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) return n2;
        return n1;
    }

    // ----------------------------------------------------------------------
    // ⚡ METHOD 3B: Euclidean Algorithm (Modulo with temp variable)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(log(min(n1, n2)))
    // 🔹 Space Complexity: O(1)
    // 🔹 Logic: Use a temporary variable to store remainder and swap values.
    //           This is the cleanest and most optimized version.
    // ----------------------------------------------------------------------
    public static int GCD_Modulo_Temp(int num1, int num2) {
        int n1 = Math.abs(num1);
        int n2 = Math.abs(num2);

        while (n2 != 0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }

    // ----------------------------------------------------------------------
    // ⚡ METHOD 3C: Euclidean Algorithm (Recursive)
    // ----------------------------------------------------------------------
    // 🔹 Time Complexity: O(log(min(n1, n2)))
    // 🔹 Space Complexity: O(log(min(n1, n2))) due to recursion stack
    // 🔹 Logic: Recursive version of modulo-based Euclidean algorithm.
    // ----------------------------------------------------------------------
    public static int GCD_Recursive(int n1, int n2) {
        if (n2 == 0) return n1;
        return GCD_Recursive(n2, n1 % n2);
    }

    // ----------------------------------------------------------------------
    // 🧪 MAIN METHOD: Testing all versions
    // ----------------------------------------------------------------------
    public static void main(String[] args) {
        int n1 = 56;
        int n2 = 12;

        System.out.println("1A. Brute Force (1→min): " + GCD_BruteForce_Up(n1, n2));
        System.out.println("1B. Brute Force (min→1): " + GCD_BruteForce_Down(n1, n2));
        System.out.println("2A. Subtraction: " + GCD_Subtraction(n1, n2));
        System.out.println("2B. Subtraction (with var): " + GCD_Subtraction_WithVar(n1, n2));
        System.out.println("3A. Modulo Simple: " + GCD_Modulo_Simple(n1, n2));
        System.out.println("3B. Modulo (with temp): " + GCD_Modulo_Temp(n1, n2));
        System.out.println("3C. Recursive Modulo: " + GCD_Recursive(n1, n2));
    }
}
