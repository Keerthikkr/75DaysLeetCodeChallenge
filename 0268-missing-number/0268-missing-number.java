class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int missing = -1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                missing = i;
                break;
            }
        }
        return missing==-1?n:missing;
    }
}