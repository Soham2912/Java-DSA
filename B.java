import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            List<Long> results = new ArrayList<>();

            for (int k = 1; k <= 18; k++) {
                long d = 1 + (long) Math.pow(10, k);
                if (d > n) break; 
                if (n % d == 0) {
                    long x = n / d;
                    results.add(x);
                }
            }

            if (results.isEmpty()) {
                sb.append("0\n");
            } else {
                Collections.sort(results);
                sb.append(results.size()).append(" ");
                for (long x : results) {
                    sb.append(x).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}
