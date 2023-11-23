package Day51;

public class Largesr_Num_atleast_Twice_of_Others {
    public static void main(String[] args) {
        int nums[] = {0,0,0,1};
        int l = -1, sl = -1, ans=-1;
        for (int i = 0; i <nums.length; i++){
            if (nums[i] > l){
                sl = l;
                l = nums[i];
                ans = i;
            } else if(nums[i] > sl){
                sl = nums[i];
            }
        }
        if(l >= 2*sl){
            System.out.println(ans);
        } else{
            System.out.println(-1);
        }
    }
}
