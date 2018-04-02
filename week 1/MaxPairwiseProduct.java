import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
     static long getMaxPairwiseProduct(int[] numbers) {
         if(number.length == 2) {
             return Long.valueOf(numbers[0]) * numbers[1];
         }
         Long result = Long.valueOf(0);
         int index = 0;
         int maxNum = numbers[index];
         int secondMax = numbers[0];
         for(int i = 1; i < numbers.length; i++) {
             if(numbers[i] > maxNum) {
                 maxNum = numbers[i];
                 index = i;
             }
         }
         for(int i = 1; i < numbers.length; i++) {
             if(i != index) {
                 if(numbers[i] > secondMax && numbers[i] <= maxNum) {
                     secondMax = numbers[i];
                 }
             }
         }
         return Long.valueOf(maxNum) * secondMax;
     }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
