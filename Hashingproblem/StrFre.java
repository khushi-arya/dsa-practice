import java.util.HashMap;

public class StrFre{
 public static void main(String[] arg){ 
   String str = "aabbcddee";
 
   HashMap<Character, Integer> map =  new HashMap<>();
   
//    for(int i =  0 ; i<str.length() ; i++){
//       if(map.containsKey(str.charAt(i))){
//          map.put(str.charAt(i), map.get(str.charAt(i))+1);
//      }else{
//         map.put(str.charAt(i), 1);
//      }
//      }
 
    for(char ch : str.toCharArray()){
       map.put(ch, map.getOrDefault(ch, 0)+1);
       
      }
     System.out.println(map);
     for(HashMap.Entry<Character , Integer> m : map.entrySet()){
        if(m.getValue() == 1){
        System.out.println(m.getKey()+" : "+m.getValue());
        break;
       }
     }

   

    
 }
}