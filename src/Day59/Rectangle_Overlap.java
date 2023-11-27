package Day59;

public class Rectangle_Overlap {
    public static void main(String[] args) {
        int rec1[] = {0,0,2,2}, rec2[] = {1,1,3,3};
        System.out.println(rec1[0] < rec2[2] &&
                rec1[1] < rec2[3] &&
                rec1[2] > rec2[0] &&
                rec1[3] > rec2[1]);
    }
}
