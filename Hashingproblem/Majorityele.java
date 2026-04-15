import java.util.HashMap;

public class Majorityele {
    public static void main(String[] args) {
        
       int[] arr = {1,1,1,1,2,3,4};

       int n = arr.length/2;    
    
       HashMap<Integer , Integer> map  = new HashMap<>();
     
       for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1); // FIXED
            } else {
                map.put(i, 1);
            }
        }

       for(HashMap.Entry<Integer , Integer> m : map.entrySet()){
         if(m.getValue()>n){
          System.out.println(m.getKey()+" appears "+m.getValue()+"times, more than "+n+" times");
         }
       }
      
        
       
    }
}
