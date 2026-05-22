public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,5,-6,7,8,9};    

        int k = 3;
        for(int i = 0 ; i<k ; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]+" : "+i);
                break;
            }
        }

        for(int i = k ; i<arr.length ; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]+" : "+i);
                break;
            }
            else if(arr[i-k] < 0){
                System.out.println(arr[i-k]+" : "+(i-k));
                break;
            }
            else{
                System.out.println("0 ");
            }
        }
    }
}
