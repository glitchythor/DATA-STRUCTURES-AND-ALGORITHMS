class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
          ans[2*i]=nums[i];//for first half index as it is in even numbersn index => 2n=>2i
          ans[2*i+1]=nums[n+i];//for second half as the secodn half elements are in odd  number index  => 2n+1=>2i+1
        }
        return ans;
    }
}  
// [2,5,1,3,4,7] => [2,3,5,4,1,7]
//  0 1 2 3 4 5 =>   0 3 1 4 2 5
//                   0 1 2 3 4 5