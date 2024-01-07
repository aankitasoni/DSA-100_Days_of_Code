package Day89;

import java.util.ArrayList;
import java.util.Collections;

public class Allocate_Books {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int n = arr.size();
        int m  =2;

        if (m > n) System.out.println(-1);;
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
        System.out.println(low);;

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

