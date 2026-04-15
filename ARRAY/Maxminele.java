public class Maxminele {
    public static void main(String[] args) {
         int[] arr = {1,2,6,4,8,9};
         int max = arr[0];
         int min = arr[0];
         
        for(int i = 0 ; i<arr.length ; i++){
           if(max<arr[i]){
            max = arr[i];  
          }
        }
        System.out.println("Max ele :"+max);

        for(int i = 0 ; i<arr.length ; i++){
           if(min>arr[i]){
            min = arr[i];  
          }
        }
        System.out.println("Min ele :"+min);

        int diff = max - min;
        System.out.println(diff);
  }
}
