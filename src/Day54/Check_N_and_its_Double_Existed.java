package Day54;

public class Check_N_and_its_Double_Existed {
    public static void main(String[] args) {
        int nums[] = {10,2,3,4};
        for(int i = 0; i<nums.length; i++){
            for(int j =0; j<nums.length; j++){
                if (nums[i] == 2*nums[j] && i != j){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
