package Day8;

public class ArraysSortedAndRotated {
    public static void main(String[] args) {
        int nums[] = {2,1 ,3,4};
       int count = 0;
       for (int i =1; i< nums.length; i++){
           if (nums[i-1] > nums[i]){
               count++;
           }
       }
       if (nums[nums.length-1]> nums[0]){
           count++;
       }
       if (count <= 1){
           System.out.println("true");
       } else {
           System.out.println("false");
       }
    }
}
