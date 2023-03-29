class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int target = 0 - nums[i];
             int start = i+1,end = n-1;
             while(start<end){
                 int value = nums[start] + nums[end];
                 if(value == target){
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[start]);
                    sublist.add(nums[end]);
                    res.add(sublist);
                    while(start<end && nums[start] == nums[start+1]) start++;
                    while(start<end && nums[end] == nums[end - 1]) end--;
                    start++;
                    end--;
                 }
                 else if(value <target){
                     start++;
                 }
                 else{
                     end--;
                 }
             }
    }
    return res;
}

}