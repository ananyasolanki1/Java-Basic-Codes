public class PalinStr { // String is palindrome or not
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = palin(s);

        // String s = "anarna";
        // boolean ans = palin(0, s);
        if (ans) {
            System.out.println();
            System.out.println("Palindrome");
        } else {
            System.out.println();
            System.out.println("Not Palindrome");
        }
    }

    // public static boolean palin(String str) {            // Method 1:   TC: O(n²)   SC: O(n)
    //     int left = 0;                                    // Defining left and right
    //     int right = str.length() - 1;
    //     while (left < right) {
    //         if (str.toLowerCase().charAt(left++) != str.toLowerCase().charAt(right--)) {
    //         return false;
    //         }
    //     }
    //     return true;
    // }


    // public static boolean palin(String str) {             // Method 2:  TC: O(n²)   SC: O(n)
    //     int ln = str.length();                            // without left and right pointers    
    //     for (int i = 0; i < ln/2; i++) {
    //         if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(ln - 1 - i)) {
    //         return false;
    //         }
    //     }
    //     return true;
    // }


    // public static boolean palin(String str) {              // Method 3:  TC: O(n²)   SC: O(n)    
    //     int ln = str.length();                             // considering only alphabets and numbers
    //     int left = 0;                                      // LEETCODE - TIME LIMIT EXCEEDED as toLowerCase() creates new string everytime
    //     int right = ln - 1;
    //     while (left < right) {
    //         if (!Character.isLetterOrDigit(str.charAt(left))) {
    //             left++;
    //         } else if (!Character.isLetterOrDigit(str.charAt(right))) {
    //             right--;
    //         } else if (str.toLowerCase().charAt(left++) != str.toLowerCase().charAt(right--)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // public static boolean palin(int i, String str) {            // Method 4: Recursion   TC: O(n)   SC: O(n)
    //     if (i >= str.length()/2) {
    //         return true;
    //     }
    //     if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
    //         return false;
    //     }
    //     return palin(i + 1, str);
    // }

    
    // public static boolean palin(String str) {                        // Method 5: Regular Expression, replacing   TC: O(n)   SC: O(n)
    //     str = str.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
    //     int left = 0;
    //     int right = str.length() - 1;
    //     while (left < right) {
    //         if (str.charAt(left++) != str.charAt(right--) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    public static boolean palin(String str) {                        // Method 6: MOST OPTIMIZED   TC: O(n)   SC: O(1)
        int left = 0;                                                // BEST ONE
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left++)) != Character.toLowerCase(str.charAt(right--))) {
                return false;
            }
        }
        return true;
    }


    // public static boolean palin(String str) {                       // Method 7: lowercase done once outside loop   TC: O(n)   SC: O(n) total / O(1) auxiliary
    //     String lower = str.toLowerCase();
    //     int left = 0;
    //     int right = lower.length() - 1;
    //     while (left < right) {
    //         if (lower.charAt(left++) != lower.charAt(right--)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
