class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len = flowerbed.length;
       int left;
       int right;


        for (int i =0; i < len; i++ ) {
             if (i == 0) {
                left = i;
             } else {
                left = flowerbed[i-1] ;
             }

             if (i == len - 1){
                right = 0;
             } else {
                right =  flowerbed[i+1]; 
             }


             if (flowerbed[i] + left + right == 0){
                flowerbed[i] = 1;
                n--;
             }

           

        }

      

        

        
        return n<=0;
    }
}