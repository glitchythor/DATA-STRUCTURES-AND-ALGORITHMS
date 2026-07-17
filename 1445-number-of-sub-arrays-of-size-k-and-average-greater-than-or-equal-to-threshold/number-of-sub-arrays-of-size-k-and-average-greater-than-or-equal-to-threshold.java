class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int target=threshold*k;
        int sum=0;
        for(int left=0;left<k;left++){
          sum+=arr[left];
        }
        if(sum>=target){
          count++;}
        
        for(int left=k;left<arr.length;left++){
          sum=sum-arr[left-k]+arr[left];
          if(sum>=target){
            count++;
          }
        }
        
        return count;
    }
}