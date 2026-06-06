class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0; // even index (positive)
        int j = 1; // odd index (negative)

        int[] ans = new int[nums.length];

        int k = 0;
        while (k < nums.length) {
            if (nums[k] > 0) {
                ans[i] = nums[k];
                i += 2;
            } else {
                ans[j] = nums[k];
                j += 2;
            }
            k++;
        }

        return ans;
    }
}