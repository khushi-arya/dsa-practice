public class OneDarray {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,9};

        
        int s =  0;
        int e = arr.length-1;
        
        System.out.println(s);
        System.out.println(e);

        while (e>s) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
            
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}