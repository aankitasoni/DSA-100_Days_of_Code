package Day75;

public class Valid_Number {
    public static void main(String[] args) {
        String s = "-90E3";
        System.out.println(s.trim().matches("[-+]?(\\d+\\.?|\\.\\d+)\\d*([eE][-+]?\\d+)?"));
    }
}
