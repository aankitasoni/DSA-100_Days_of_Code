package Day14;

public class Max_Consecutive_One {
    public static void main(String[] args) {
        int nums[] = {1,1,4,5,0,1,1,1,0,1,1,1,1};
        int count = 0, max = 0;
        for (int i =0; i<nums.length;i++){
            if (nums[i] == 1){
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        System.out.println(Math.max(count, max));
    }
}
