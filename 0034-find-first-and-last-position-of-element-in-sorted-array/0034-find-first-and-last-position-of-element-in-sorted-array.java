class Solution {
    public int[] searchRange(int[] nums, int target) {
            int n  = nums.length;
        int[] ans = {-1,-1};

        int low = 0, high = n-1;

        //First 
        while(low<=high){
            int mid = (low + high)/2;

            if(target == nums[mid]){
                ans[0] = mid;
                high = mid -1;
            }
            else if(target > nums[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        
        low = 0;
        high = n-1;
        //last
         while(low<=high){
            int mid = (low + high)/2;

            if(target == nums[mid]){
                ans[1] = mid;
                low = mid+1;
            }
            else if(target > nums[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }

        return ans;
    }
}