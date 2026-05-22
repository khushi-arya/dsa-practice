public class AvgSubArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        int sum = 0 ;

        for(int i  = 0 ; i<k ; i++){
            sum = sum +arr[i];
        }


        for(int  i = k ; i<arr.length ; i++){
            double avg = sum / k ;
            sum = sum +arr[i] - arr[i -k];
            
            System.out.print(avg+" ");

        }
    }
}
