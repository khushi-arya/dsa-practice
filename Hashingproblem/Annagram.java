import java.util.HashMap;

public class Annagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 =  "dsilent";
 
       HashMap<Character, Integer> map =  new HashMap<>();
       boolean isAnagram = false;
       for(char c : str1.toCharArray()){
         map.put(c , map.getOrDefault(c, 0)+1);
       }
       
       for(char c : str2.toCharArray()){
          if(map.containsKey(c)){
             isAnagram =  true;
          }else{ 
              isAnagram = false;
              break;
          }
       } 
  
       if(isAnagram){
         System.out.println("Str1 and str2 is anagram");
      }else{ 
        System.out.println("Str1 and str2 is not anagram");
         }

    }
}
