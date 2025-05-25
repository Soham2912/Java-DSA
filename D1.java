import java.util.Scanner;

public class D1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long k = scanner.nextLong();
            System.out.println(solve(k));
        }
        
        scanner.close();
    }
    
    public static long solve(long k) {
        long sum = 0;
        long currentPos = 0;
        int numDigits = 1;
        
        while (currentPos < k) {
            long start = (numDigits == 1) ? 1 : power10(numDigits - 1);
            long end = power10(numDigits) - 1;
            long numbersInGroup = end - start + 1;
            long digitsInGroup = numbersInGroup * numDigits;
            
            if (currentPos + digitsInGroup <= k) {
                // Take all numbers in this group
                sum += calculateGroupSum(start, numbersInGroup, numDigits);
                currentPos += digitsInGroup;
            } else {
                // Take partial numbers from this group
                long remainingDigits = k - currentPos;
                long completeNumbers = remainingDigits / numDigits;
                long extraDigits = remainingDigits % numDigits;
                
                if (completeNumbers > 0) {
                    sum += calculateGroupSum(start, completeNumbers, numDigits);
                }
                
                if (extraDigits > 0) {
                    long partialNumber = start + completeNumbers;
                    sum += getPartialDigitSum(partialNumber, (int)extraDigits);
                }
                break;
            }
            
            numDigits++;
        }
        
        return sum;
    }
    
    // Calculate sum of all digits for 'count' numbers starting from 'start'
    public static long calculateGroupSum(long start, long count, int numDigits) {
        long sum = 0;
        
        // For each digit position from right to left (0-indexed)
        for (int pos = 0; pos < numDigits; pos++) {
            sum += calculatePositionSum(start, count, pos);
        }
        
        return sum;
    }
    
    // Calculate sum contribution from digit at position 'pos' (0 = rightmost)
    public static long calculatePositionSum(long start, long count, int pos) {
        long sum = 0;
        long power = power10(pos);
        
        for (long i = 0; i < count; i++) {
            long number = start + i;
            long digit = (number / power) % 10;
            sum += digit;
        }
        
        return sum;
    }
    
    // Get sum of first 'digits' digits of a number
    public static long getPartialDigitSum(long number, int digits) {
        String numStr = String.valueOf(number);
        long sum = 0;
        
        for (int i = 0; i < digits && i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';
        }
        
        return sum;
    }
    
    // Calculate 10^n efficiently
    public static long power10(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 10;
        }
        return result;
    }
}
