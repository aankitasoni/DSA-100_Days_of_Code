package Day3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int count = 2;
        for (int i = 2; i<nums.length; i++){
            if (nums[count - 2] != nums[i]){
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
