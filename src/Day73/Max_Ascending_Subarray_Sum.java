package Day73;

public class Max_Ascending_Subarray_Sum {
    public static void main(String[] args) {
        int nums[] = {10,20,30,5,10,50};
        int p = nums[0], ans = nums[0];
        for (int i =1; i < nums.length; i++){
           if (nums[i] > nums[i-1]){
               p += nums[i];
           } else {
               p = nums[i];
           }
           ans = Math.max(ans, p);
        }
        System.out.println(ans);
    }
}
