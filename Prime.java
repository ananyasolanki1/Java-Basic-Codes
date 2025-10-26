// public class Prime {
//     public static void main(String[] args) {
//         boolean val = isPrime(12);
//         System.out.println(val);
//     }

//     public static boolean isPrime(int n) {   // optimized  TC: O(√n)   SC: O(1)
//         if (n <= 1)
//             return false;
//         if (n == 2)
//             return true;
//         if (n % 2 == 0)
//             return false;
//         for (int i = 3; i <= Math.sqrt(n); i += 2) {
//             if (n % i == 0) 
//                 return false;
//         }
//         return true;
//     }
// }