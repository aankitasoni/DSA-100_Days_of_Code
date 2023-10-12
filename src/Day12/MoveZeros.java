package Day12;

public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {2,0,4,0,9,0,5};
        int j = -1;
        for (int i =0; i <nums.length; i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) {
            for (int i =0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
        }
        for (int i =j+1; i< nums.length; i++){
            if (nums[i] != 0){
                int p = nums[i];
                nums[i] = nums[j];
                nums[j] = p;
                j++;
            }
        }
        for (int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
