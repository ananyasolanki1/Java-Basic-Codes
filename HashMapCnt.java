import java.util.*;

class HashMapCnt {                             // This code uses HashMap to calculate element frequency
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int len = arr.length;
        freq(arr, len);
    }
    
    static void freq(int[] arr, int ln) {
        Map<Integer, Integer> mp = new HashMap<>();    // HashMap to store element -> frequency 
        for (int i = 0; i < ln; i++) {                 // O(n): Loop through array
            if (mp.containsKey(arr[i])) {              // if map has that no. as key....
                mp.put(arr[i], mp.get(arr[i]) + 1);    // ...then add that key with one val incremented
                // O(1) avg: containsKey(), get(), put()
            }
            else {
                mp.put(arr[i], 1);             // add that no. as key and 1 as val as it appeared fist time
            }
        }
        
        // O(k): Iterate over unique elements (k = distinct elements)
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {    // Entry is interface, entry val is of type Entry, iterates over key-val pairs
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }        
        
        // Time Complexity: O(n) + O(k) ≈ O(n)
        // Space Complexity: O(k) for HashMap (k ≤ n)
    }
}
