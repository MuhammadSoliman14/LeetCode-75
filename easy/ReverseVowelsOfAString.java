 
class Solution {
    public String reverseVowels(String s) {
        
        char [] chars = s.toCharArray();
        int l = 0;
        int r=  s.length()-1;
        
        while (l < r){
            while (l < r && !isVowel(chars[l])) {
                l++;
            }

            while (r > l && !isVowel(chars[r])) {
                r--;
            }

             if  (l < r) {
                 char temp = chars [l];
                 chars [l] = chars [r];
                 chars [r] = temp;
                l++;
                r--;
             }

           

            }
              return new String (chars); 
        }
    


   public boolean isVowel(char c) {
    return c == 'A' || c == 'a' ||
           c == 'E' || c == 'e' ||
           c == 'I' || c == 'i' ||
           c == 'O' || c == 'o' ||
           c == 'U' || c == 'u';
}

}