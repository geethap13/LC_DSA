Brute force Aprroach:
For each element, check the remaining elements in the array and check the sum equal to target or not.here two loops are used
TC:O(n^2)
SC:O(1)
​
Better Approach(hashing)
For each element,subtract the element value from target and check the hashmap,if it present return the index ,store it in the result and return.if not present,then store the element value along with index in hashmap(nums[i],i).
TC : O(n)
SC: (n)
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
Two pointer Approach:
Sort the array and place two pointers at start and end and check the sum equal to target .if sum > target,move end or else move start pointer.
TC : O(nlogn +n)
SC :O(1)