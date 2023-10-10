package Day10;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int c = 0;
        for (int i =1; i<nums.length; i++){
            if (nums[c] != nums[i]){
                nums[c+1] = nums[i];
                c++;
            }
        }
        System.out.println(c+1);
    }
}
