package Day3;

public class GoodPairs {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,3};
        int n = nums.length;
        int count =0 ;
        for (int i =0; i< n; i++){
            for (int j =0; j< nums.length; j++){
                if(i < j && nums[i]  == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
