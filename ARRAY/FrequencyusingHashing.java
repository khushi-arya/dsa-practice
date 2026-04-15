import java.util.HashMap;

public class FrequencyusingHashing{
     public static void main(String[] args) {
        int[] arr  = {1,2,3,4,7,3,4,2,4,8};
        
        HashMap<Integer , Integer > hashmap = new HashMap<>();
       
        for(int n : arr){
         if(hashmap.containsKey(n)){
            hashmap.put(n, hashmap.get(n)+1);
          }else{
            hashmap.put(n , 1);
          }
         }
        
          System.out.println(hashmap);

     }
}