package Day52;

public class Count_And_Say {
    public static void main(String[] args) {
        int n = 4;
        if (n ==1){
            System.out.println("1");
        }
        if (n==2){
            System.out.println("11");
        }
        String s = "11";
        for(int i =3; i<=n; i++){
            String t = "";
            s += '&';
            int c = 1;
            for(int j = 1; j <s.length(); j++){
                if(s.charAt(j) != s.charAt(j-1)){
                    t +=  String.valueOf(c);
                    t +=  s.charAt(j-1);
                    c = 1;
                } else {
                    c++;
                }
            }
            s = t;
        }
        System.out.println(s);
    }
}
