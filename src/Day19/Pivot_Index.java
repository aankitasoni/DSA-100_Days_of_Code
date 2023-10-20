package Day19;

public class Pivot_Index {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int t =0, l =0;
        for (int i : nums){
            t += i;
        }
        for (int i =0; i< nums.length;i++){
            if (2*l == t - nums[i]){
                System.out.println(i);
            }
            l+= nums[i];
        }
        System.out.println("-1");
    }
}
