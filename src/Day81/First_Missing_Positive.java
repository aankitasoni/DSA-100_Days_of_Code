package Day81;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int nums[] = {1,2,0};
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            if (nums[i] > 0 && nums[i] <= n){
                arr[nums[i]-1] = nums[i];
            }
        }
        for (int i =0; i < n; i++){
            if (arr[i] != i+1){
                System.out.println(i+1);
                break;
            }
        }
        System.out.println(n+1);
    }
}
