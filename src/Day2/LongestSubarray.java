

package Day2;

public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] =  {323376,323376,323376,323376,323376,323376,323376,75940,75940};
        int max = 0;
        for (int i =0; i< arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int count = 1;
        int max_length = 1;
        for (int i =0; i <arr.length-1; i++){
            if ( max == arr[i] && arr[i] == arr[i+1]){
                count++;
            } else {
                count = 1;
            }
            max_length = Math.max(max_length, count);
        }
        System.out.println(max_length);
    }
}
