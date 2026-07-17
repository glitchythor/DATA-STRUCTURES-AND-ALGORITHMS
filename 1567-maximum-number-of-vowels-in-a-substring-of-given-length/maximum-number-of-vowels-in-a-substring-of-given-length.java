class Solution {
  private boolean isvowel(char c){
  return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
  }
    public int maxVowels(String s, int k) {
        int left=0;int count=0;int max=0;
        for(int right=0;right<s.length();right++){
          if(isvowel(s.charAt(right))){
            count++;
          }
          if(right-left+1==k){
            max=Math.max(max,count);
            if(isvowel(s.charAt(left))){
              count--;
            }
            left++;
          }
        }
        return max;
    }
}