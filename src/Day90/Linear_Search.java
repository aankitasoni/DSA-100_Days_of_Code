package Day90;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {6,7,8,4,1};
        int num = 4;
        for (int i =0; i < arr.length; i++){
            if (arr[i] == num){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
