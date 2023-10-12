package Day11;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        k %= n;
        int kk[] = new int[n-k];
        for (int i = 0; i < n-k; i++) {
            kk[i] = nums[i];
        }
        for (int i =  n-k; i < n; i++) {
            nums[i - n + k] = nums[i];
        }
        for (int i = 0; i < n-k; i++) {
            nums[i+k] = kk[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
