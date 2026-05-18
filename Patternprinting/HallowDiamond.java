public class HallowDiamond {
    public static void main(String[] args) {
        
        int n = 6;
        // upper half
        for(int i = 1 ; i<=n; i++){
            for(int j =  1; j<=n-i; j++){
                System.out.print(" ");
            }

            if(i == 1 ){
                for(int j = 1; j<=i; j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int j = 1; j<=i-2; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half
        for(int i = n-1 ; i>=1; i--){
            for(int j =  1; j<=n-i; j++){
                System.out.print(" ");
            }

            if(i == 1 || i==n){
                for(int j = 1; j<=i; j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int j = 1; j<=i-2; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
