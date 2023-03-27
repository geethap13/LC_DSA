Valid Strings: Alphanumeric
Two pointer Approach:
first change all the strings to lowercase/uppercase
1.place two pointers at the start and end and iterate till start < end
2.check each character for valid alpha numeric either by
Character.isLetterOrDigit(ch) or write the func to validate.
3.if char at start is not valid iterate the start till its valid and make the same chec for
end pointer as well
4.Now check start and end characters,
if not same return false
else continue
TC:O(n)
SC:O(1)