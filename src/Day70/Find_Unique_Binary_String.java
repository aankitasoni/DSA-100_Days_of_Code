package Day70;

public class Find_Unique_Binary_String {
    public static void main(String[] args) {
        String nums[] = {"111","011","001"};
        String s = "";
        for (int i =0; i < nums.length; i++){
            char ch = nums[i].charAt(i);
            if (ch == '0'){
                ch = '1';
            } else {
                ch = '0';
            }
            s += ch;
        }
        System.out.println(s);
    }
}
