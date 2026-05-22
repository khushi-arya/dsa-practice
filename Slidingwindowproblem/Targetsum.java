public class Targetsum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2,9};
        int t = 12;
        int sum = 0 ;
        int k = 3;
        for(int i = 0 ; i<k ; i++){
            sum = sum +arr[i];
        }
        
        for(int i  = k ; i < arr.length ; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];

            if(sum == t ){
                System.out.println("ele list : ");
                for(int j = i-k+1 ; j<=i ; j++){
                    System.out.println(arr[j]);
                }
            }
        }



        }
}
