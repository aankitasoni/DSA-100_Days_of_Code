package Day80;

import java.util.ArrayList;

public class Summary_Ranges {
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,7};
        ArrayList<String> al = new ArrayList<>();
        int n = nums.length;
        for (int i = 1, j = 0; i <= n; i++){
            if (i == n ||  nums[i-1]+1 != nums[i]){
                if (j != i-1){
                    al.add(nums[j]+ "->" + nums[i-1]);
                } else {
                    al.add(Integer.toString(nums[j]));
                }
                j = i;
            }
        }
        System.out.println(al);
    }
}
