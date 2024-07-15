// The function takes two integrals m and n as arguments. 
// You are required to obtain the total of all integers ranging between 1 to n (both inclusive) which are not divisible by m.
// You must also return the distinction between the sum of integers not divisible by m with the sum of integers divisible by m.

public class diffSum {

    public static int sumAndDifference(int m, int n) {
        int sumNotDivisibleByM = 0;
        int sumDivisibleByM = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisibleByM += i;
            } else {
                sumNotDivisibleByM += i;
            }
        }

        int difference = sumNotDivisibleByM - sumDivisibleByM;

        return difference;
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 30;

 System.out.println("Difference between sum of integers not divisible by " + m + " and sum of integers divisible by " + m + ": " + sumAndDifference(m, n));
    }
}
