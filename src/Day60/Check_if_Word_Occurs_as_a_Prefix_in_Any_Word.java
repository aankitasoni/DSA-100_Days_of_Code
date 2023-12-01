package Day60;

public class Check_if_Word_Occurs_as_a_Prefix_in_Any_Word {
    public static void main(String[] args) {
        String s = "i love eating burger", ss = "burg";
        String arr[] = s.split(" ");
        for (int i =0; i< arr.length; i++){
            String p = arr[i];
            if (p.startsWith(ss)){
                System.out.println(i+1);
            }
        }
        System.out.println(-1);
    }
}
