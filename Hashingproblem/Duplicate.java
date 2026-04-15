import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
         String str = "Helo";
         boolean haveduplicate = false;
         HashMap<Character , Integer> map = new HashMap<>();
 
         for(char ch : str.toCharArray()){
           if(map.containsKey(ch)){      
           map.put(ch , map.getOrDefault(ch,0)+1);
           }else{
             map.put(ch,1);
           }
         }
   
        for(HashMap.Entry<Character ,Integer> m : map.entrySet()){
           if(m.getValue()>1){
             haveduplicate = true;
           }
        }

        System.out.println(map);
        if(haveduplicate){
         System.out.println("true");
        }
    }
}
