// Character Hashing

class CntCharNum {
    public static void main(String[] args) {
        String str = "abccdabefc";   // Count in this string
        char[] strarr = {'a', 'c', 'z', 'e', 'f'};    // Queries array
        int[] hasharr = new int[strarr.length];  // array to store the count
        int cnt = 0;
        char currch;
        for (int i = 0; i < strarr.length; i++) {
            currch = strarr[i];    // one by one selects char from queries array
            for (int j = 0; j < str.length(); j++) {   // loop over given string str
                if (str.charAt(j) == currch) {     
                    cnt++;  
                }
            }
            hasharr[i] = cnt;   // store count of char in hasharr sequence wise
            cnt = 0;
        }
        for (int i = 0; i < hasharr.length; i++) {
            System.out.print(strarr[i] + " -> ");  // print char
            System.out.println(hasharr[i]);   // print char's count
        }
    }
}
