import java.util.Scanner;

public class C {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
        
        scanner.close();
    }
    
    public static long solve(int n) {
        long totalCost = 0;
        int position = 0; 
        
        while (n > 0) {
            int digit = n % 3; 
            n /= 3;
            
            if (digit > 0) {
                
                long cost = calculateDealCost(position);
                totalCost += digit * cost;
            }
            
            position++;
        }
        
        return totalCost;
    }
    
    
    public static long calculateDealCost(int x) {
        if (x == 0) {
            
            return 3;
        }
        
        long pow3x = 1;
        for (int i = 0; i < x; i++) {
            pow3x *= 3;
        }
        
        long pow3x_plus_1 = pow3x * 3;
        long pow3x_minus_1 = pow3x / 3;
        
        return pow3x_plus_1 + x * pow3x_minus_1;
    }
}
