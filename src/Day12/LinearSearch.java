package Day12;

public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {2,4,6,0,8};
        int k = 6;
        for (int i =0; i<nums.length; i++){
            if (nums[i] == k){
                System.out.println(i);
            }
        }
    }
}
