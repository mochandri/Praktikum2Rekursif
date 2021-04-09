
import java.util.Scanner;

public class no2 {
    public static void Kombinasi (String a, int b , int c){
        if(b==0)
            System.out.print(a +" ");
        else 
            for (int i = 97;i<97+c;i++){
                Kombinasi (a + (char)i, b-1,c);
            }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Karakter : ");
        Scanner input = new Scanner (System.in);
        int d = input.nextInt();
        Kombinasi(" ", d,d);
        System.out.println(" ");
}
}
