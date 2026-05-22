public class slidingwindow{
    public static void main(String[] args) {
    
          int[] arr = {1,1,2,3,7,8,2,3};
      int k = 3 ;
      int sum = 0;
      
      for(int i = 0 ; i<k ; i++){
          sum =sum +arr[i];
      }
      int max = sum ;
      int startingindex = 0 ;
      for(int  i = k ; i<arr.length ; i++){
          sum = sum + arr[i];
          sum = sum - arr[i-k];
          if(sum > max){
              max = sum ;
              startingindex = i - k + 1;
          }
      }
      int Stsum = 0;
      System.out.println("ele list : ");
      for(int i =startingindex ; i<startingindex+k ; i++){
          Stsum = Stsum + arr[i];
          System.out.println(arr[i]);
      }
      System.out.println("Stsum : "+Stsum);
      System.out.println("max : "+max);         
    }
}