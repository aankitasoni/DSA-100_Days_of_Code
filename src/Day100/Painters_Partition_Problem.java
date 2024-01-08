package Day100;

import java.util.ArrayList;
import java.util.Collections;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        int m =2;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        int n = arr.size();
        if (m > n) System.out.println(-1);
        int low = Collections.max(arr);
        int high = 0;
        for (int i =0; i < n; i++){
            high += arr.get(i);
        }
        while ( low <= high){
            int mid = (low + high)/2;
            int students = fun(arr, mid);
            if (students > m) {
                low = mid +1;
            } else {
                high = mid -1;
            }

        }
        System.out.println(low);

    }

    public static int fun(ArrayList<Integer> arr, int b){
        int students = 1;
        long pages = 0;
        for (int i =0; i < arr.size(); i++){
            if (pages + arr.get(i) <= b ){
                pages += arr.get(i);
            } else {
                students += 1;
                pages = arr.get(i);
            }
        }
        return students;
    }
}
