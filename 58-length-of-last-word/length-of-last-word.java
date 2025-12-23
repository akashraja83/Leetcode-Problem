class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int last = s.lastIndexOf(' ');
        if(last == -1)
            return s.length();
        return s.length()-last-1;
    }
}