package Day14;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int nums[] = {1,1,3,4,4,5,5,6,6};
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        System.out.println(ans);
    }
}
