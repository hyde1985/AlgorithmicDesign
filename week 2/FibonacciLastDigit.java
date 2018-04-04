import java.util.*;
import java.math.BigInteger;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if(n <= 1) return n;
        int[] fibNum = new int[n+1];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for(int i = 2; i <= n; i++) {
            int temp = fibNum[i - 1] % 10 + fibNum[i - 2] % 10;
            fibNum[i] = temp;
        }
        return fibNum[n] >= 10 ? fibNum[n] % 10 : fibNum[n];     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}
