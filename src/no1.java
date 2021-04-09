import java.util.*;
public class no1{
  static long faktorial(int n){
    int a = 1;
    int b = 1;
    while(b <= n){
      a=a*b;
      b++;
    }
    return a;
  }
  public static void main(String[] args){
    int a; 
    int i; 
    int j;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai: ");
    a = input.nextInt();
    for (i=0; i<a; i++){
      for (j=0; j<a-i-1; j++){
        System.out.print(" ");
      }
      for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
  }  
}