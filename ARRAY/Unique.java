public class Unique {
    public static void main(String[] args) {
        int[] arr ={1,6,8,4,3,8};
        
        boolean isunique = false;
        for(int i = 0 ; i<arr.length ; i++){
         int count = 0;
         for(int j = 0 ; j<arr.length ; j++){
          if(arr[i] == arr[j]){
             count++;
           }
          }
         if(count<2){
              isunique = true;
           }else{
             isunique = false;
             break;
           }
        }
         
       if (isunique) {
        System.out.println("All are unique");
       }else{
         System.out.println("All are not unique");
         }
    }
}
