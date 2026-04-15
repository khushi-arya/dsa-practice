public class checksortinASC {
    public static void main(String[] args) {
         int[] arr = {1,2,5,4,7,8};
         boolean isASC = false;
        for(int i = 1 ; i<arr.length-2 ; i++){
           if(arr[i]< arr[i+1]){
            isASC = true;
            continue;
            }else{
            isASC = false;
            break;
           }
        }
        if(isASC){
           System.out.println("Arr is in Ascending order");
          }else{
           System.out.println("Arr is not in Ascending order");
          }
    }
}
