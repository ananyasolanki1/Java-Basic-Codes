public class RevNum {
    public static void main(String[] args) {
        int nm = rev(10400);
        System.out.println(nm);
    }

    public static int rev(int n) {    // optimal approach     TC: O(log(n)+1)  SC: O(1) cnst amt of additional memory regardless of inp size
        int lastdig;
        int newnum = 0;
        while (n > 0) {
            lastdig = n % 10;
            newnum = (newnum * 10) + lastdig;
            n /= 10;
        }
        return newnum;
    }
}
