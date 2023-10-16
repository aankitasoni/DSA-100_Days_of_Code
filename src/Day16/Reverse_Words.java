package Day16;


public class Reverse_Words {
    public static void main(String[] args) {
        String s = "Welcome   to Coding Ninjas";
        String[] ss = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i =ss.length-1; i >=0; i--){
            sb.append(ss[i]);
            if (i != 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
