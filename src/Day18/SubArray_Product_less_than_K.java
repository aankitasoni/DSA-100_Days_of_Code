package Day18;

public class SubArray_Product_less_than_K {
    public static void main(String[] args) {
        int nums[] = {10,5,2,6};
        int k = 100;
        int count =0;
        for (int i =0; i<nums.length; i++){
            long mul = 1;
            for (int j =i; j <nums.length; j++){
                mul *= nums[j];
                if (mul < k) {
                    count++;
                } else {
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
