package Day69;

import java.util.Arrays;

public class Max_Element_after_Decreasing_and_Rearranging {
    public static void main(String[] args) {
        int arr[] = {466,720,330,509,486,117,25,320,396,352,432,816,193,265,112,260,922,748,523,215,989,621,443,837,999,22,231,19,407,150,37,737,983,165,457,722,519,695,437,558,853,226,1000,646,817,712,529,462};
        Arrays.sort(arr);
//        for (int i =0; i<arr.length-1; i++){
//            if (arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] =arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
        int prev = 0;
        for (int i : arr){
            if (i > prev){
                prev++;
            }
        }
        System.out.println(prev);
    }
}
