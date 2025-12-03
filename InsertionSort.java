import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {14, 9, 6, 12, 4, 15};
        insertSort(arr);
    }
    
    static void insertSort(int arr[]) {
        int n = arr.length;
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
