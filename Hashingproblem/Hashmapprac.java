import java.util.HashMap;

public class Hashmapprac {
  public static void main(String[] args) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        map.put(3,9);
        map.put(4, 16);

         
      System.out.println(map.get(1)+1);
      System.out.println("map contains: "+map.containsKey(2));
      System.out.println("Remove ele: "+map.remove(1));
      System.out.println(map);
      System.out.println("Key 2: " + map.getOrDefault(2, 0));
 
      
  }
}
