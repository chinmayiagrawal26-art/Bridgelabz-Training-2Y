class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
      int[] freq = new int [26];
      for(int i=0;i<word1.length();i++){
        freq[word1.charAt(i)-'a']++;
      }
      for(int j=0;j<word2.length();j++){
        freq[word2.charAt(j)-'a']--;
      }
      for(int i=0;i<26;i++){
        if(Math.abs(freq[i]) > 3){
            return false; 
        }
      }  
      return true;
    }
}