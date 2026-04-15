public class PGTk {
    public static void main(String[] args) {
        int[] arr ={2,9,8,4,4,5,1,7};
        int k = 4;
        for(int i = 0 ; i<arr.length ; i++){
          if(arr[i]>k){
          System.out.println(arr[i]+" is greater than "+k);
           }
         }
         int f = 5;

         boolean found = false;
         for(int i = 0 ; i<arr.length ; i++){
           if(arr[i] == f){
             found = true;
             break;
             }else{
             found = false;
              }
          }
         if(found){
         System.out.println("Found");
          }else{
         System.out.println("Not found");
          }
     
        int freq = 0;
        int num = 4;
        for(int i = 0 ; i<arr.length ; i++){
        if(num == arr[i]){
          freq++;
         }
        }
       System.out.print("Frequency of "+num+" is: "+freq);
    }
}
