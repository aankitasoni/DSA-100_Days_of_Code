package Day27;

public class Sum_of_Digits_by_Converting_String {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
            String p = "";
            for (char c : s.toCharArray()){
                p += c-'a'+1;
            }
        System.out.println(p);
          int sum = 0;
            while(k > 0){
                for(char c : p.toCharArray()){
                    sum += c-'0';
                }
                p = String.valueOf(sum);
                k--;
                if(k == 0) break;
                sum =0;
            }
        System.out.println(sum);
    }
}
