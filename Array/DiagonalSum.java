public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

       System.out.println(arr.length);
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           for(int j = 0; j<arr[i].length; j++) {
    
                   sum+=arr[i][i];
                   sum+=arr[i][arr.length-1-i];
               

           }
       }
       if(arr.length%2!=0) {
           sum-=arr[arr.length/2][arr.length/2];
       }
       System.out.println(sum);
    }
}
