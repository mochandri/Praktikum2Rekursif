public class no8 {
    public static boolean binarySearch(int [] x, int start, int end, int n){
        if(end < start) return false;
        int mid = (start + end) /2;
        if(x[mid]==n){
            return true;
        }else{
            if (x[mid]<n){
                return binarySearch(x, mid+1,end,n);
            }else{
                return binarySearch(x,start,mid-1,n);
            }
        }
    }
    public static void main(String[] args) {
        int[] Array = {1,2,32,4,1,1,4,6,54,53,45,76,34,98,54,76,55,33};
        int y = Array.length;
        int x = 12345;
        
        boolean result = binarySearch(Array, 0, y-1,x);
        System.out.println(result);
}
}
