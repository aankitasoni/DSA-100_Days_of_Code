package Day22;

public class Sign_of_Product_of_Array {
    public static void main(String[] args) {
        int nums[] = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int sign = 1;
        for (int i =0; i<nums.length; i++){
            if (nums[i] > 0){
                sign *= 1;
            } else if(nums[i] < 0){
                sign *= -1;
            } else {
                System.out.println("0");
            }
        }
        System.out.println(sign);
    }
}
