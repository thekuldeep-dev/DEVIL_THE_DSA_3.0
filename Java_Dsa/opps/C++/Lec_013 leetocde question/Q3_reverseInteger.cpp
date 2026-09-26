class Solution {
public:
    int reverse(int x) {
        int ans = 0, rem, pow = 100;
        while(x!=0){
            rem = x%10;
            ans += rem*pow;
            x /= 10;
            pow /= 10;
        }
        return ans;
    }
};