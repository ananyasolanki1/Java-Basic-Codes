public class PalinNum {
    public static void main(String[] args) {
        System.out.println(Palin(127821));
    }

    public static String Palin(int n) {     // optimal approach     TC: O(log(n)+1)  SC: O(1) cnst amt of additional memory regardless of inp size
        int num = n;
        int rev = 0;
        int lastdig;
        while (n > 0) {
            lastdig = n % 10;
            rev = rev * 10 + lastdig;
            n /= 10;
        }
        if (rev == num) {
            // System.out.println("Palindrome");
            return "Palindrome";
        }
        // System.out.println("Not Palindrome");
        return "Not Palindrome";
    }
}