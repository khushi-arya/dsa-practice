import java.util.*;

public class SubString {
    public static void main(String[] args){
        String  str = "abddcabv";

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int sti = 0;
        for(int i = 0; i<str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                sti = left;
            }
        }

        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
        System.out.println("The longest substring without repeating characters is: " + str.substring(sti, sti + maxLength));
    }
    }

