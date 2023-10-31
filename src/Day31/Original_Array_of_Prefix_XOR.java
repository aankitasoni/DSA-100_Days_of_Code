package Day31;

public class Original_Array_of_Prefix_XOR {
    public static void main(String[] args) {
        int pref[] = {5,2,0,3,1};
        int arr[] = new int[pref.length];
        arr[0] = pref[0];
        for (int i =1; i< pref.length; i++){
            arr[i] = pref[i] ^ pref[i-1];
        }
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
