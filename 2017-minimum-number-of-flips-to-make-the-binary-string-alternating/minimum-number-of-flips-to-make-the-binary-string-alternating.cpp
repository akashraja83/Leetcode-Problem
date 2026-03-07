class Solution {
public:
    int minFlips(string s) {
        int n = s.size();
        string t = s + s;
        int ans = n, mis0 = 0;
        for (int i = 0; i < 2 * n; i++) {
            char exp0 = (i % 2 == 0) ? '0' : '1';
            if (t[i] != exp0) mis0++;
            if (i >= n) {
                int left = i - n;
                char expL = (left % 2 == 0) ? '0' : '1';
                if (t[left] != expL) mis0--;
            }
            if (i >= n - 1)
                ans = min(ans, min(mis0, n - mis0));
        }
        return ans;
    }
};