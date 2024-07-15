// For writing numbers, there is a system called N-base notation. This system uses only N-based symbols. It uses symbols that are listed as the first n symbols. Decimal and n-based notations are 0:0, 1:1, 2:2, …, 10:A, 11:B, …, 35:Z.

// Perform the function: Chats DectoNBase(int n, int num)

// This function only uses positive integers. Use a positive integer n and num to find out the n-base that is equal to num.

// Steps

// Select a decimal number and divide it by n. Consider this as an integer division.
// Denote the remainder as n-based notation.
// Again divide the quotient by n.
// Repeat the above steps until you get a 0 remainder.
// The remainders from last to first are the n-base values.


public class BaseConversion {

    public static String DectoNBase(int n, int num) {
        if (n < 2 || n > 36) {
            return "0" ;
        }

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        char[] symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        while (num > 0) {
            int remainder = num % n;
            result.append(symbols[remainder]);
            num = num / n;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 12;
        int num = 718;

        System.out.println("The " + n + "-base representation of " + num + " is: " + DectoNBase(n, num));
    }
}
