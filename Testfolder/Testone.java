import java.util.HashMap;

public class Testone {
    public static void main(String[] args) {
         String str = "aadccbb";
 
    HashMap<Character ,Integer > map = new HashMap<>();
 
    for(char ch : str.toCharArray()){
      if(map.containsKey(ch)){
          map.put(ch, map.getOrDefault(ch, 0)+1);
       }else{ 
         map.put(ch,1);
       }
    }
    System.out.println(map);
     for(char ch : str.toCharArray()){
    if(map.get(ch) == 1){
        System.out.println("first non repeating char is: " + ch);
        break;
    }
}
    }
}
