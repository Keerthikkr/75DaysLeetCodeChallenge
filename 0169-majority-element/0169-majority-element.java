class Solution {
    public int majorityElement(int[] arr) {
        int freq = 0;
        int ans = 0;

        for (int value : arr) {
            if (freq == 0) {
                ans = value;
            }

            if (value == ans) {
                freq++;
            } else {
                freq--;
            }
        }

        return ans;
    }
}