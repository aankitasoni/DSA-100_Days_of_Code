package Day85;

import java.util.ArrayList;

public class Maximum_subarrays_of_size_k {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int max = arr[0];
        for (int i = 0; i < n-k+1; i++){
            max = arr[i];
            for (int j = i+1; j < i +k; j++){
                if (arr[j] > max){
                     max = arr[j];
                }
            }
            al.add(max);
        }
        System.out.println(al);
    }
}
