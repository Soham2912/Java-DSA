// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

// Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.

class CountDigits{
    static int evenlyDivides(int N){
        // code here
        int c=0;
        String s=String.valueOf(N);
        char a[]= s.toCharArray();
        for(int i=0;i<a.length;i++){
        int m=Character.getNumericValue(a[i]);
        if(m==0){
            continue;
        }
        if(N%m==0){
            c++;
        }    
        }return c;
    }
}