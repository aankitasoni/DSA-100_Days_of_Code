package Day90;

public class Largest_Element_in_the_Array {
    public static void main(String[] args) {
        int arr[] = {4,7,8,6,7,6};
        int max = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
