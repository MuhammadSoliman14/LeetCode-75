class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max =0;
        boolean [] result = new boolean [len];
        for (int i =0; i < len; i++){
            if (candies[i] >= max){
                max = candies[i];
            }
        }
        
         for (int i =0; i < len; i++){
    
            if (candies[i] + extraCandies >= max){
            result[i] = true;
        } else {
            result[i] = false;
        }
         }
    
  List<Boolean> resultList = new ArrayList<>();
    for (boolean b : result) {
        resultList.add(b);
    }
    return resultList;
}

}