import java.util.HashMap;


public class Morethanonce {
    public static void main(String[] args) {
        int[] arr =  {1,2,2,2,3,4,6,7,7,6};
 
        HashMap<Integer , Integer> map =  new HashMap<>();
 
        for(int i : arr){
         if(map.containsKey(i)){
          map.put(i,map.get(i)+1);
         }else{
          map.put(i,1);
         }
       }
       for(HashMap.Entry<Integer , Integer> m : map.entrySet()){
          if(m.getValue() >1){
             System.out.println(m.getKey()+ " appear more once");
          }
       }
        
    }
}
