public class no5 {
    public static void decToBin(int num){
    if (num >0){
        decToBin(num /2 );
        System.out.println(num % 2);
    }      
    }
    public static void main(String[] args) {
        decToBin(8);
        decToBin(6);
}
}
