package Day66;

public class Distribute_Money_to_Max_Children {
    public static void main(String[] args) {
        int money = 16, children = 2;
        money -= children;
        if (money < 0){
            System.out.println(-1);
        }
        if (money /7 == children && money % 7 == 0){
            System.out.println(children);
        }
        if (money / 7 == children-1 && money % 7 == 3){
            System.out.println(children - 2);
        }
        System.out.println(Math.min(children-1, money/7));
    }
}
