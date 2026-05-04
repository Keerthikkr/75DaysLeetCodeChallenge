class Solution {
    public void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;

        while (i <= r) {
            if (nums[i] == 0) {
                int t = nums[l];
                nums[l] = nums[i];
                nums[i] = t;
                l++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int t = nums[r];
                nums[r] = nums[i];
                nums[i] = t;
                r--;
            }
        }
    }
}