package Day32;

public class Operations_to_Array {
    public static void main(String[] args) {
        int nums[] = {0,1};
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int p = 0;
        for(int i =0; i <nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
               // p++;
            }
        }
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
