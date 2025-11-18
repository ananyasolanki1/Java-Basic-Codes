import java.util.*;

public class CntQueryNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int[] qr = {1, 3, 4, 2, 10};
        int cnt = 0;
        // int[] ans = new int[qr.length];
        ArrayList<Integer> ans = new ArrayList<>();
        int qrno;
        for (int i = 0; i < qr.length; i++) {
            qrno = qr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == qrno) {
                    cnt++;
                }
            }
            ans.add(cnt);
            cnt = 0;
        }
        System.out.println(ans);
    }
}
