class Solution {
    public boolean isAlpha(char ch){
        return (ch >='0' && ch <='9') || (ch >='a' && ch <='z') || (ch >='A' && ch <='Z') ;
    }
    /*
    public boolean isPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = len-1;
        s = s.toLowerCase();
        while(start < end){
          
            while(start < end && !isAlpha(s.charAt(start))){
                start++;
            }
            while(end > start && !isAlpha(s.charAt(end))){
                end--;
            }
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    */
    
    public boolean isPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = len-1;
        s = s.toLowerCase();
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(end > start && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}