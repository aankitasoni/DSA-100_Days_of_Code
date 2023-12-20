package Day78;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int f[] = {1,0,0,0,1};
        int n = 1;
        int count = 1, res = 0;
        for (int i =0; i < f.length; i++){
            if (f[i] == 0){
                count++;
            } else {
                res += (count-1)/2;
                count = 0;
            }
        }
        if (count != 0) res = count/2;
        System.out.println(res >=n);
    }
}
