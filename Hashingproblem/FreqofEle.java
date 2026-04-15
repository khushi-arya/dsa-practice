import java.util.HashMap;

public class FreqofEle {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,8,9,3,10};
      
       for(int i : arr){
         System.out.print(" "+i);
       }
       System.out.println();
       HashMap<Integer , Integer> map = new HashMap<>();
       
       for(int i : arr){
        if(map.containsKey(i)){
           map.put(i , map.get(i)+1 );
         }else{
          map.put(i, 1);
         }
       }
      System.out.println("Keys : ");
      for(int k : map.keySet()){
       System.out.print(" "+k);}
      System.out.println();
      System.out.println("Values: ");
      for(int v: map.values()){
     System.out.print(" "+v);
     }
 System.out.println();
    for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
     if(e.getValue() == 1){
      System.out.println(e.getKey()+" : "+e.getValue());
      break;
     }
} 


 
}
}
