public class PalinStr {     // String is palindrome or not
    public static void main(String[] args) {
        String s = "";
        boolean ans = palin(s);
        System.out.println(ans);
    }

    public static boolean palin(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.toLowerCase().charAt(left++) != str.toLowerCase().charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
