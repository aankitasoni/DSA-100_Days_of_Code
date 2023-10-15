package Day15;

public class Maximum_Consecutive_Ones_III {
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,1,0,1,1,1,1,0};
        int k = 2;
        int i =0, j=0;
        while (j < nums.length){
            if (nums[j] == 0){
                k--;
            } if (k < 0){
                if (nums[i] == 0){
                    k++;
                }
                i++;
            }
            j++;
        }
        System.out.println(j-i);
    }
}
