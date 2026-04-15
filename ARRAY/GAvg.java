public class GAvg {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8};
       
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
           sum = sum+arr[i];
       }
       int avg = sum/arr.length ;
       
       System.out.println(avg);
      
      for(int i = 0 ; i<arr.length ; i++){
         if(arr[i]>avg){
           System.out.println(arr[i]+ " is gerater than "+avg);
          }
        }
    }
}
