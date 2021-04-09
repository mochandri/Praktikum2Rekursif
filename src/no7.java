public class no7 {
    public static void main(String[] args) {
        int[]Array = {1,2,3,4,5,6,7,8};
        System.out.println(search(Array,Array.length,100));
}
    public static boolean search(int[] x,int size, int n){
        if(size >0){
            if(x[size-1]== n) {
                return true;
            }else{
                    return search(x,size-1,n);
                            }
            }
            return false;
        }
    }

