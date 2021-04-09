public class no11 {
    public static String ex234(int n){
        if(n <= 0) return "";
        return ex234(n-3) + n + ex234(n-2) +n;
    }
    public static void main(String[] args) {
        System.out.println(ex234(6));
}
}
