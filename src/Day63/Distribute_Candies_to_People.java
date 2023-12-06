package Day63;

public class Distribute_Candies_to_People {
    public static void main(String[] args) {
        int c = 10, num = 3;
        int ans[] = new int[num];
        int index = 0, prev = 0;
        while (c > 0){
            int p = Math.min(c, prev+1);
            ans[index % num] += p;
            index++;
            c -= index;
            prev = index;
        }
        for (int i =0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
