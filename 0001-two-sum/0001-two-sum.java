class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] res = new int[2];
        for(int i =0;i<n;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                res[0] = map.get(sum);
                res[1] = i;
                return res;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}