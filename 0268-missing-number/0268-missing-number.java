class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing=-1;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                missing = i;
                break;
            }
        }
        return missing==-1?n:missing;
    }
}