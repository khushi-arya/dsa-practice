import java.util.HashSet;

public class Uniqueele {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,6,7};
        
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i : arr){
         hashSet.add(i);
        }
        int count = 0;
        for(int i : hashSet){
         System.out.print(" "+i);
          count++;
        }
        System.out.println();
        System.out.println("Num of diff ele: "+count);
    }
}
