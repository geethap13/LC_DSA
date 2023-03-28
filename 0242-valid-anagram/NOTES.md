**Using Frequency Array:**
Store the frequency of characters in String S(increment) and T(decrement) in freq array  for the corresponding character.
Now traverse the frequency array and check all are 0.if not return false.
TC : O(n+m+n)
SC : O(1)(256 characters - defined)
​
​
**Using Sorting:**
change the strings to character array and sort them and then convert to string and compare them.
TC : O(nlogn + mlogm)
SC : O(1)