class Solution {
    public boolean isThree(int n) {
        int x = (int)Math.sqrt(n);
        if(x*x != n) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i == 0)
            return false;
        }
        return x>1;
    }
}