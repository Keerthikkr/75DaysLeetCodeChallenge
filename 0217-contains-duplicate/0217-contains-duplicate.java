class Solution {
    public boolean containsDuplicate(int[] nums) {
        int p1 = 0;
        int p2 = p1+1;
        Arrays.sort(nums);
        while(p2<nums.length){
            if(nums[p1]==nums[p2]){
                return true;
            }
            p2++;
            p1++;
        }
        return false;

    }
}