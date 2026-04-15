public class Frequency {
    public static void main(String[] args) {
         int[] arr = {1,2,2,3,4,2};

         for(int  i = 0 ;  i<arr.length ; i++){
          boolean counted = false;
          for(int k = 0 ; k<i; k++ ){
           if(arr[i] == arr[k]){
              counted = true;
             }
           }
           if(counted){ continue; }
 
           int count = 0;
           for(int j = 0; j<arr.length ; j++){ 
               
               if(arr[i] == arr[j]){
                  count++;
              }
           
            }
          System.out.println(arr[i]+" "+count+" times");
         }
 
    }
}
