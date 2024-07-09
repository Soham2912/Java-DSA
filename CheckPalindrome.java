/*  Given an integer x, return true if x is a palindrome
 , and false otherwise. */

 

 //First way
 class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}


//Second way
class Soltion {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        char a[]= s.toCharArray();
        boolean b = true ;
        for(int i=0;i<a.length;i++){
            int m=Character.getNumericValue(a[i]);
            int n = Character.getNumericValue(a[a.length-i-1]);
            if(m!=n){
                b=false;
            }
        }
        return b;
    }
}