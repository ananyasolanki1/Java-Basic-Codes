import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr = {13, 9, 42, 20, 56, 12};
        bubbleSort(arr);
    }
    
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
