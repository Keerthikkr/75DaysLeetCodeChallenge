class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        boolean[] seen = new boolean[n];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            seen[num-1] = true;
        }
        for(int i=0;i<nums.length;i++){
            if(!seen[i]){
                result.add(i+1);
            }
        }
        return result;
    }
}