package Day18;

public class SubArray_Sum {
    public static void main(String[] args) {
        int  nums[] = {1,2,3};
        int k = 2;
        int count =0;
        for (int i =0; i<nums.length; i++){
            int sum =0;
            for (int  j =i; j< nums.length; j++){
                sum += nums[i];
                if (sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
