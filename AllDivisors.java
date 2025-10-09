import java.util.ArrayList;
import java.util.Collections;

public class AllDivisors {

    // Brute force   TC: O(n)   SC: O(d); d = number of divisors
    // public static void main(String[] args) {
    //     int[] narr = divisors(9);
    //     System.out.println(Arrays.toString(narr));
    // }

    // public static int[] divisors(int n) {
    //     int cnt = 0;        // count the number of divisors
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             cnt++;
    //         }
    //     }

    //     int[] arr = new int[cnt];    // create an array of size = number of divisors
    //     int idx = 0;
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             arr[idx] = i;    // store the divisors into the array
    //             idx++;
    //         }
    //     }
    //     return arr;
    // }


    // optimal approach     TC: O(√n)   SC: O(d)
    public static void main(String[] args) {
        int num = 12;
        ArrayList<Integer> newarr = divisors(num);
        System.out.println(newarr);
    }

    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                arr.add(i);
                if (i != n/i) {
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);  // more universal
        // arr.sort(Comparator.naturalOrder()); // for Java 8+
        return arr;
    }
}
