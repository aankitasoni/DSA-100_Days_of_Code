package Day94;

import java.util.Arrays;

public class Find_minimum_and_maximum_element_in_array {
    public static void main(String[] args) {
        long a[] = {3,2,1,56,1000,167};
        Arrays.sort(a);
        System.out.print(a[0] + " " + a[a.length-1]);
    }
}
