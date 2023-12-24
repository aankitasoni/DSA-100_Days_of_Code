package Day73;

public class Validate_IP_Address {
    public static void main(String[] args) {
        String s = "172.16.254.1";
        String ip6 = "(([a-fA-F_0-9]{1,4}:){7})([a-fA-F_0-9]{1,4})";
        String ip4 = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        if (s.matches(ip6)) {
            System.out.println("ip6");
        } else if (s.matches(ip4)){
            System.out.println("ip4");
        } else {
            System.out.println("neither");
        }
    }
}
