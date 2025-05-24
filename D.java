import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            System.out.println(solve(n, k));
        }
        
        scanner.close();
    }
    
    public static long solve(long n, long k) {
        
        long temp = n;
        long minDeals = 0;
        while (temp > 0) {
            minDeals += temp % 3;
            temp /= 3;
        }
        
        if (minDeals > k) {
            return -1;
        }
        
        
        Map<String, Long> memo = new HashMap<>();
        return dp(n, k, memo);
    }
    
    public static long dp(long n, long k, Map<String, Long> memo) {
        if (n == 0) return 0;
        if (k == 0) return Long.MAX_VALUE;
        
        String key = n + "," + k;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        long result = Long.MAX_VALUE;
        
        
        long power = 1;
        int x = 0;
        
        while (power <= n) {
            long maxDeals = Math.min(n / power, k);
            
            for (long deals = 1; deals <= maxDeals; deals++) {
                long cost = deals * calculateDealCost(x);
                long remaining = n - deals * power;
                long remainingCost = dp(remaining, k - deals, memo);
                
                if (remainingCost != Long.MAX_VALUE) {
                    result = Math.min(result, cost + remainingCost);
                }
                
               
                if (deals > 1) {
                    long prevCost = (deals - 1) * calculateDealCost(x);
                    if (cost - prevCost >= calculateDealCost(x)) {
                        
                        break;
                    }
                }
            }
            
            x++;
            if (power > Long.MAX_VALUE / 3) break;
            power *= 3;
        }
        
        memo.put(key, result);
        return result;
    }
    
   
    public static long calculateDealCost(int x) {
        if (x == 0) {
            return 3; 
        }
        
        long pow3x = 1;
        for (int i = 0; i < x; i++) {
            pow3x *= 3;
        }
        
        return 3 * pow3x + x * (pow3x / 3);
    }
}
