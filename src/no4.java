
import java.util.Scanner;

public class no4 {
    public static void Pindah(int disc, char pasak1, char pasak2, char media){
        if(disc==0){
            return;
        }else{
            Pindah(disc -1,pasak1,pasak2,media);
            System.out.println("Pindahkan Disc" + disc + " Dari pasak" + pasak1 + " ke pasak "+ pasak2);
            Pindah(disc -1, media,pasak1,pasak2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Jumlah Pasak :");
        int n = input.nextInt();
        Pindah (n, 'A','B','C');
}
}
