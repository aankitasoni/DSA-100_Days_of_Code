package Day5;

public class Separate_Digits_in_Array {
    public static void main(String[] args) {
        int nums[] = {13,25,83,77};
        String s = "";
        for (int i : nums){
            s += i;
        }
        int arr[] = new int[s.length()];
        for (int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }
        for (int i =0; i <arr.length; i++){
            System.out.print(arr[i]);
        }
     }
}
