public class SecondLarge {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,7,9};
       int  max = Integer.MIN_VALUE;
       int  secondMax = Integer.MIN_VALUE;
        
     
        for(int i = 0 ; i<arr.length ; i++){
           if(max<arr[i]){
            max = arr[i];  
          }
        }
        for(int i = 0 ; i<arr.length ; i++){
          if(arr[i]<max){
             if(secondMax <arr[i]){
                secondMax = arr[i];
             }
          }
        }
      System.out.print(secondMax);
    }
}
