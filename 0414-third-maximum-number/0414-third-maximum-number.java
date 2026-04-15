class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 3) {
            return nums[n - 1];
        }
        int count = 1;
        int ans = nums[n - 1];

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            if (count == 3) {
                ans = nums[i - 1];
                break;
            }
        }

        return ans;
    }
}