class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        n = Math.min(n, 10);
        int result = 10;
        int unique = 9;
        int available = 9;
        for (int i = 2; i <= n; i++) {
            unique *= available;
            result += unique;
            available--;
        }
        return result;
    }
}
