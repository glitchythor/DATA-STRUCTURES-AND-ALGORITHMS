class Solution {
    public boolean isPalindrome(int x) {
        int original_number=x;
        int reverse_number=0;

       if(x<0){
        return false;
       }
       else{
        while(x>0){
          reverse_number=reverse_number*10+(x%10);
          x=x/10;
        }
        return original_number==reverse_number;
       }
    }
}