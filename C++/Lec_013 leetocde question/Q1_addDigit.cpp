// 258. Add Digits
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

// Example 1:

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
// Example 2:

// Input: num = 0
// Output: 0
 

// My solution for this but after i see its not correct for all test case
// class Solution {
// public:
//     int addDigits(int num) {
//             int ans = 0, rem;
//             while(num!=0){
//                 rem = num%10;
//                 ans+=rem;
//                 num /=10;
//                 if (ans>9)
//                 {
//                     num = ans;
//                     ans = 0;
//                 }
                
//             }
//             num = ans;
//         return num;
//     }
// };



// correct solution is 
class Solution {
public:
    int addDigits(int num) {
        while(num>9){
            int ans = 0, rem;
            while(num!=0){
                rem = num%10;
                ans+=rem;
                num /=10;
            
            }
            num = ans;
        }
        return num;
    }
};