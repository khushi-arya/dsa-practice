import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,5};
        int t =  10;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){ 
           int c = t - arr[i];
           
           if(map.containsKey(c)){
             System.out.println(c+ " + "+arr[i]);
           }
         map.put(arr[i] ,i);
        }
        
    }
}
