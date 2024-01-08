package Day100;

public class Most_Frequent_Even_Element {
    public static void main(String[] args) {
        int nums[] = {4,4,4,9,2,4};
        int[] arr = new int[100001];
        int ans = 1;
        for(int i : nums){
            if(i % 2 == 0){
                arr[i]++;
                if ((arr[ans] < arr[i]) || (arr[ans] == arr[i] && ans > i)){
                    ans = i;
                }
            }
        }
        if (ans == 1) System.out.println(-1);;
        System.out.println(ans);
    }
}
