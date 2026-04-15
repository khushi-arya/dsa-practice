public class Sumavgarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,4};
        int sum =0 ;
        for(int i = 0; i<arr.length ; i++){
            sum =sum+arr[i];
        }
        int avg = sum/2;
        System.out.println("Sum :"+sum);
        System.out.println("avg :"+avg);
    }
}
