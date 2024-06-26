/*
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
 */




class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0 , right = (long) Math.sqrt(c);
        while(left<=right){
            long num = left*left + right*right;
            if(num == c) return true;
            if(num < c ) left++;
            if(num > c ) right--;
            

        }
        return false;
    }
}