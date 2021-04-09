public class no10 {
    public static boolean golLike (int a, int b){
        if(b==0) return (a==1);
        return golLike (b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(golLike(1,0));
}
}
