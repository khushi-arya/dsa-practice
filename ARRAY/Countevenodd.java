public class Countevenodd {
   public static void main(String[] args) {
    int[] arr = {1,5,3,2,8,7};
    
     int Ocount =0 ;
     int Ecount = 0;
    
     for(int i :arr){
      if(i == 0){
       continue;
        }else if(i%2 == 0){
       Ecount++;
       }else  if(i%2 !=0){
       Ocount++;
        }else if(i<0){
         System.out.print("Negative");
          }
     }
     System.out.println("Count of even ele: "+Ecount);
     System.out.println("Count of odd ele: "+Ocount);

   }  
}
