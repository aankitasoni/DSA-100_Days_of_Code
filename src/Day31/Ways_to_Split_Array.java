package Day31;

public class Ways_to_Split_Array {
    public static void main(String[] args) {
        int nums[] = {10,4,-8,7};
        long sum = 0;
        long currSum = 0;
        for (int i : nums){
            sum += i;
        }
        int count = 0;
        for(int i =0; i<nums.length-1; i++){
            currSum += nums[i];
            if(currSum >= sum -currSum){
                count++;
            }
        }
        System.out.println(count);
    }
}
