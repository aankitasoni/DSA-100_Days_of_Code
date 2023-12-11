package Day72;

public class Element_Appearing_more_than_25_Percent {
    public static void main(String[] args) {
        int arr[] = {1,1,3};
        int n = arr.length/4;
        for (int i = 0; i< arr.length-n; i++){
            if (arr[i] == arr[i+n]){
                System.out.println(arr[i]);
            }
        }
        System.out.println(-1);
    }
}
