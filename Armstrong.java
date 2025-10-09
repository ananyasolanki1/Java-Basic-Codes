public class Armstrong {
    public static void main(String[] args) {
        boolean res = isArmstrong(1634);
        System.out.println(res);
    }

    public static boolean isArmstrong(int n) {   // optimal   TC: O(log10(n) + 1)  SC: O(1)
        int digCnt = (int) Math.log10(n) + 1;    // number of digits
        int sum = 0;
        int lastNum;
        int num = n;
        while (n != 0) {
            lastNum = n % 10;
            sum += Math.pow(lastNum, digCnt);
            n /= 10;
        }
        return sum == num;
    }
}
