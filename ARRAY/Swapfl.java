public class Swapfl {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,6,3,8};
        int t = arr[0] ;
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = t;
        System.out.println("Arr after swapping first and last else ");
        for(int i : arr){
          System.out.print(" "+i);
         }
          System.out.println();
        System.out.println("Negative Ele with 0");
         for(int i = 0; i<arr.length ; i++){
          if(arr[i]<0){
             arr[i] = 0;
           }
          }
         
       for(int i : arr){
          System.out.print(" "+i);
         }
       
        System.out.println();
        int evencount =0 ;
        for(int i = 0; i<arr.length ; i++){
          if(arr[i]%2 == 0){
             evencount++;
           }
          }
          int[] arreven = new int[evencount] ;
          
          for(int i = 0; i<arr.length ; i++){
          if(arr[i]%2 == 0){
             arreven[i] = arr[i];
           }
          }
          System.out.println("Even arrr : ");
          System.out.println(arreven.length);
          for(int i :arreven){
             System.out.print(" "+i);
            }
       
 
        
    }
}
