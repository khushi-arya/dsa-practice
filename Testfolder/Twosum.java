import java.util.HashMap;

public class Twosum{
   public static void main(String[] arg){
     int[] arr = {2,3,4};
     int t = 6;
 
     HashMap<Integer , Integer> map =  new HashMap<>();
       
     for(int i = 0; i<arr.length; i++){
            int c = t - arr[i];
             if (map.containsKey(c)) {
                System.out.println("[" + map.get(c) + ", " + i + "]");
                return;
            }
            map.put(arr[i], i);
        }

 }
}