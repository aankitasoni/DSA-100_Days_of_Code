package Day43;

public class Keep_Mul_Found_values_By_2 {
    public static void main(String[] args) {
        int nums[] = {5,3,6,1,12};
        int p = 3;
        int i =0;
        while(i != nums.length){
            if(nums[i] == p){
                i=0;
                p = 2*p;
            } else{
                i++;
            }
        }
        System.out.println(p);
    }
}
