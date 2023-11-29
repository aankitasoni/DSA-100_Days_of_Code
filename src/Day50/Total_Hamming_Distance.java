package Day50;

public class Total_Hamming_Distance {
    public static void main(String[] args) {
        int nums[] = {4,14,4};
        int count = 0;
        for(int i =0; i<nums.length; i++){
            for(int j = i; j < nums.length; j++){
                count += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        System.out.println(count);
    }
}
