public class MaxSubArr {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,3};
        int k = 3;
        int sum = 0;

        for(int i  = 0 ; i<k ; i++){
            sum = sum +arr[i];
        }

        int max = sum;
        int sti = 0;
        for(int i = k ; i<arr.length ; i++){
            sum = sum + arr[i]- arr[i-k];
            if(sum > max){
                max = sum ;
                sti = i - k + 1;
            }
        }

        for(int i = sti ; i<sti+k ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Max sum is : "+max);
    }
}