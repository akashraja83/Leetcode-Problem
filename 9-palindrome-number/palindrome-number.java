class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        if(num < 0)
            return false;
        while(num > 0){
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        if(x == rev)
            return true;
        else 
            return false;
    }
}