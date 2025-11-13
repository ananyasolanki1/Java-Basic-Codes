// Find the highest/lowest frequency element

import java.util.*;

class HighLowCnt {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,20,20};
        int len = arr.length;
        hiLowCnt(arr, len);
    }
    
    static void hiLowCnt(int[] arr, int n) {      // TC: O(n)   SC: O(n) 
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else {
                mp.put(arr[i], 1);
            }
        }
        int maxFrq = 0, maxEle = 0;
        int minFrq = n, minEle = 0;
        int cnt, ele;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ele = entry.getKey();
            cnt = entry.getValue();
            if (cnt > maxFrq) {
                maxEle = ele;
                maxFrq = cnt;
            }
            if (cnt < minFrq) {
                minEle = ele;
                minFrq = cnt;
            }
        }
        System.out.println("Element " + maxEle + " has the highest frequency -> " + maxFrq);
        System.out.println("Element " + minEle + " has the lowest frequency -> " + minFrq);
    }
}
