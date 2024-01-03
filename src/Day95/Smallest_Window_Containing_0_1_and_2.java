package Day95;

public class Smallest_Window_Containing_0_1_and_2 {
    public static void main(String[] args) {
        String s = "10212";
        int a =-1, b = -1,c = -1;
        int count = Integer.MAX_VALUE;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) == '0'){
                a = i;
            } else if (s.charAt(i) == '1'){
                b = i;
            } else {
                c = i;
            }
            if (a != -1 && b != -1 && c !=-1){
                count = Math.min(count, i+1 - Math.min(a, Math.min(b,c)));
            }
        }
        if (count == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        System.out.println(count);
    }

}
