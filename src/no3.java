public class no3 {
    public static int Binary (int[] a, int b, int c){
        if(c<0)
            return -1;
        else if (a[c]==b)
            return c;
        else 
            return Binary(a,b,c-1);
    }
    public static int Caridata (int[]a, int b){
        return Binary (a,b,a.length -1);
    }
    public static void main(String[] args) {
        int [] data = {10,28,34,64,77,89,42,24,76,87,90,76,11,23};
        System.out.print("Data :");
        for (int i=0;i<data.length;i++)
            System.out.print(" "+data[i]);
        System.out.println("\nData yang dicari 89");
        int nilai = Caridata(data,89);
        if (nilai >=0){
            System.out.println("Data " + 89 + " Ditemukan pada index ke - " + nilai);    
        }else
            System.out.println("data tidak ditemukan");
        
        
}
    
}
