public class subarrsum {
    public static void sum(int[] arr ,int st){
        int sum =  0;
        for(int i = 0 ; i< st ; i++){
          sum = sum +arr[i];
        }

        int max = sum;
       for(int i = 1 ; i<=arr.length-st ; i++ ){
         sum = sum - arr[i - 1] +arr[i+st-1];
         if(sum > max ){
            
         }
       }
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6,9};
 
        int subarr = 3;

         
    }
}
