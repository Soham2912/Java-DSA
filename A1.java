import java.util.*;

public class A1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            String a = sc.next(); 
            int m = sc.nextInt(); 
            String b = sc.next(); 
            String c = sc.next(); 
            
            StringBuilder result = new StringBuilder(a);
            
            
            for (int i = 0; i < m; i++) {
                char charToAdd = b.charAt(i);
                char whoAdds = c.charAt(i);
                
                if (whoAdds == 'V') {
                    
                    result.insert(0, charToAdd);
                } else {
                    
                    result.append(charToAdd);
                }
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
}
}