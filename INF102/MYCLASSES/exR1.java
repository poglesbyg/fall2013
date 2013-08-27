public class exR1 {
    public static String ex(int n) {
        if (n <= 0) return "";
        return ex(n-3) + n + ex(n-2) + n;
    }
    public static void main(String[] args){
        System.out.println(ex(Integer.parseInt(args[0])));
    }
}
