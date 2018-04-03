import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        // [0, 1, 1, 2, 3......]
        // n = index of the array
        if(n == 0) return 0;
     	if(n == 1) return 1;
        long[] fibNum = new long[n+1];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for(int i = 2; i < fibNum.length; i++) {
            long temp = fibNum[i - 1] + fibNum[i - 2];
            fibNum[i] = temp;
        }
        return fibNum[n];
    }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
