import java.util.HashMap;
import java.util.HashSet;

public class Testtwo {
    public static void main(String[] args) {
        int[] arr = {100,1,2,500,800,3,4,5};
       
        HashSet<Integer> set = new HashSet<>();
     
        for(int i : arr){
          set.add(i);
        }
        int lenght = 0;
        for(Integer i : set){ 
         int s =  i+1;
          if(set.contains(s)){
             System.out.print(" "+i);
             lenght++;
           }
       }
      System.out.println();
      System.out.println(lenght);
       
     
    
    }
}
