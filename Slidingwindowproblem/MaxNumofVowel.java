public class MaxNumofVowel {
  
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "abcideou";
        int k = 3;
        int count = 0;

        for(int i = 0 ; i < k ; i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }

        int max = count;
        int STI = 0;

        for(int i = k ; i < str.length() ; i++){
            count = count
                    + (isVowel(str.charAt(i)) ? 1 : 0)
                    - (isVowel(str.charAt(i - k)) ? 1 : 0);

            if(count > max){
                max = count;
                STI = i - k + 1;
            }
        }

        // print substring with max vowels
        for(int i = STI ; i < STI + k ; i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        System.out.println("Max vowels in substring of size k: " + max);
    }
}

