public class CountDig {  
    public static void main(String[] args) {
        int ans = countDigit(167323);
        System.out.println(ans);
    }

    public static int countDigit(int n) {
        int cnt;    
        // while (n > 0) {      // TC: O(log(n))  SC: O(1)
        //     n /= 10;
        //     cnt++;
        // }


        // optimal approach     // TC: O(1)  SC: O(1)
        cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }
}
