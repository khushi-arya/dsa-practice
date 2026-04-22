import java.util.HashMap;

public class StringFreq{

    public static void main(String[] arg){
         String str = "hello world world";
            String[] strArr = str.split(" ");
            char[] chars = str.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            HashMap<String, Integer> strMap = new HashMap<>();
            for(char c: chars){
                  if(c == ' ') continue;
                if(map.containsKey(c)){
                    map.put(c , map.get(c)+1);
                }else{
                    map.put(c ,1);
                }
            }
            for(HashMap.Entry<Character, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            for(String s: strArr){
                if(strMap.containsKey(s)){
                    strMap.put(s,  strMap.get(s)+1);
                }else{
                    strMap.put(s, 1);
                }
            }
            for(HashMap.Entry<String, Integer> entry: strMap.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
    }
}