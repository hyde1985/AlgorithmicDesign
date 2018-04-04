import java.util.*;
import java.math.*;

public class LCM {
    private static long lcm_naive(int a, int b) {
       BigInteger bigA = BigInteger.valueOf(a);
       BigInteger bigB = BigInteger.valueOf(b);
       BigInteger mul = bigA.multiply(bigB);
       BigInteger g = BigInteger.valueOf(Long.valueOf(gcd(a, b)));
       return mul.divide(g).longValue();
   }

   private static int gcd(int a, int b) {
       if(b == 0) return a;
       return gcd(b, a % b);
   }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
