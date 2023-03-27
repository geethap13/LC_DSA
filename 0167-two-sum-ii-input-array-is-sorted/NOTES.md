Brute Force Approach:
Traversing all the elements in the array and for each element, traverse the remaining array and find the sum and check it equals to target.if so add it in resultant array and return it.
TC:O(n^2)
SC:O(1)
​
Optimal Approach: Two pointer Approach
​
Make two pointers at start and end.
Iterate until (start < end)
check the sum equal to target.
As array is sorted,
we will decrement the end if sum > target
increment start if sum<target
TC : O(n) if the target not present have to iterate till n
SC : O(1)