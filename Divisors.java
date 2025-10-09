class Divisors {
    public static void main(String[] args) {
        int num = 36;
        System.out.print("[");
        divs(num);
        System.out.print("]");
    }
    
    public static void divs(int n) {    // brute force  TC: O(n)  SC: O(n)
        int arr[] = new int[n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[cnt] = i;
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
