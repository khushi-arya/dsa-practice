public class FOandLO {
    public static void main(String[] args) {
         int[] arr = {1,2,3,8,6,2,9};
        int k =2 ;

        int i = 0;
        int j = arr.length-1;
        
        while (i<j) {
           if(arr[i]== k && arr[j] == k){
             System.out.println("First occurence of "+k+ " at "+i);
             System.out.println("Last occurence of "+k+ " at "+j);
             break;
            }else{
               i++;
               j--;
            }
         
        }
    }
}
