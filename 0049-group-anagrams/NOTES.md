Sort each String and put it in a hashmap as a key and add respective string as value if not present in hashmap.otherwise create a list and add the string for the key in hashmap.
Atlast add all the map key values to the result and return it.
TC : O(n * klogk) -> n - total no of input words, k->avg length of each word,klogk ->for sort the string
SC : O(n) -> n - total no of input words,
​
public List<List<String>> groupAnagrams(String[] strs) {
​
List<List<String>> res = new ArrayList<>();
HashMap<String,List<String>> map = new HashMap<>();
for(String s:strs){
char[] ch1 = s.toCharArray();
Arrays.sort(ch1);
//String word = Arrays.toString(ch1); can use this also
String word = new String(ch1);
if(map.containsKey(word)){
map.get(word).add(s);
}
else{
List<String> newList = new ArrayList<>();
newList.add(s);
map.put(word,newList);
/*
Or use this
map.put(word,new ArrayList<>());
map.get(word).add(s);
*/
}
}
res.addAll(map.values());
return res;
​
}
​
**Using hash array:**
find hash array for each String and convert it into string and put it in a hashmap as a key and add respective string as value if not present in hashmap.otherwise create a list and add the string for the key in hashmap.
Atlast add all the map key values to the result and return it.
TC : O(n *k) -> n - total no of input words, k->avg length of each word.
SC : O(n) -> n - total no of input words,
public List<List<String>> groupAnagrams(String[] strs) {
​
List<List<String>> res = new ArrayList<>();
HashMap<String,List<String>> map = new HashMap<>();
for(String s:strs){
int[] hash = new int[26];
for(int i=0;i<s.length();i++){
hash[s.charAt(i)-'a']++;
}
//String word = Arrays.toString(hash); can use this also
String word = new String(Arrays.toString(hash));
if(map.containsKey(word)){
map.get(word).add(s);