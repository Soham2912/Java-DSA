// Perform the function Int calculate(int m, int n). This function needs two positive integers. 
// Calculate the sum of numbers between these two numbers that are divisible by 3 and 5.

public class SuminRange {
    public static int sumbetn(int m , int n){
                int sum =0;

            for(int i = m; i<=n;i++){
                if(i%3==0 && i%5==0){
                    sum+=i;
                }

            }   
            return sum; 
       }

       public static void main(String[] args) {
              int m = 12;
              int n = 50;
            //   SuminRange obj = new SuminRange();
            //   int result = obj.sumbetn(m, n);
              System.out.println("Result: " + sumbetn(m, n));
       }
}
