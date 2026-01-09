class Solution {
    public int Value(char c){
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
    public int romanToInt(String s) {
        StringBuilder sb = new StringBuilder();
        int total=0;
        int pre = 0;
        for(int i=s.length()-1;i>=0;i--){
            int curr = Value(s.charAt(i));
            if(curr<pre) total -= curr;
            else total += curr;
            pre = curr;
        }
        return total;
    }
}