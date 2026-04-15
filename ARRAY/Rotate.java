public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i : arr){ 
         System.out.print(" "+i);
        }
        System.out.println();
        for(int i = 0 ; i<arr.length-1; i++){ 
            int t = arr[i];
            arr[i]= arr[i+1] ;
            arr[i+1] =t ;
             
        }
        for(int i : arr){ 
         System.out.print(" "+i);
        }
        System.out.println();
        for(int i = arr.length-1; i>0; i--){ 
            int t = arr[i];
            arr[i]= arr[i-1] ;
            arr[i-1] =t ;
             
        }
       for(int i : arr){ 
         System.out.print(" "+i);
        }
    }
}
