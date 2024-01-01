package Day93;

public class Assign_Cookies {
    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[] = {1,1};
        int i =0, j =0;
        int total = 0;
        while (i < g.length && j < s.length){
            if (s[j] >= g[i]){
                total++;
                i++;
            }
            j++;
        }
        System.out.println(total);
    }
}
