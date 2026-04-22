
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,6,7,7,8,8};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                map.put(i , map.get(i)+1);
            }else{
                map.put(i ,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }

        }
    }
}
