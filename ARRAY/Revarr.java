public class Revarr {
    public static void main(String[] args) {
         int[] arr = {1,2,5,4,7,9};
         int m = arr.length/2;
         
         for(int i :arr){
          System.out.print(" "+i);  
        } 
         System.out.println();
   
         System.out.println("Reverse arr");
         for(int i =0 ; i<m; i++){ 
          int t =  arr[i];
          arr[i] = arr[arr.length-i-1];
          arr[arr.length-i-1] = t;
       
           }
         for(int i :arr){
          System.out.print(" "+i);  
        } 
         
    }
}
