package Day17;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int nums[] = {2,4,5,6};
        int p = nums.length;
        int arr[] = new int[2*p];
        for (int i =0; i < p; i++){
            arr[i] = nums[i];
            arr[i+p] = nums[i];
        }
        for (int i : arr){
            System.out.print(arr[i] + " ");
        }
    }
}
