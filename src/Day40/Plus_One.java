package Day40;

public class Plus_One {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        for(int i = nums.length-1; i >=0; i--){
            if(nums[i] < 9){
                nums[i]++;
                System.out.println(nums[i]);
            }
            nums[i] = 0;
        }
        nums = new int[nums.length+1];
        nums[0] = 1;
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]);
        }
    }
}
